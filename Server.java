import java.net.*;
import java.io.*;

public class Server 
{
    private ServerSocket server;
    public String chatLog = "";

    public Server(int port)
    {
        try
        {
            server = new ServerSocket(port);
            server.setSoTimeout(100000);
        }
        catch (SocketException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void laufen()
    {
        while(true)
        {
            try
            {
                //System.out.println("Waiting for Client..." + server.getLocalPort());
                Socket client = server.accept();
                DataInputStream input = new DataInputStream(client.getInputStream());
                chatLog += input.readUTF().toString();
                DataOutputStream output = new DataOutputStream(client.getOutputStream());
                output.writeUTF(chatLog);
                client.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
                break;
            }
            
        }
    }
    public static void main (String[]args)
    {
        Server s  = new Server(5000);
        s.laufen();
    }
}