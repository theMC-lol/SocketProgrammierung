import java.io.*;
import java.net.*;

public class Client
{
    static String ipAdresse = "127.0.0.1";

    public static void senden (String name, String nachricht)
    {
        //System.out.println("Sendet");
        try
        {
            Socket client = new Socket(ipAdresse, 5000);
            DataOutputStream output = new DataOutputStream(client.getOutputStream());
            output.writeUTF(name + " :  " + nachricht +"\n");
            DataInputStream input = new DataInputStream(client.getInputStream());
            System.out.println(input.readUTF());
            client.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public static String chatAbfrage()
    {
        //System.out.println("Chatabfrage");
        try
        {
            Socket client = new Socket(ipAdresse, 5000);
            DataOutputStream output = new DataOutputStream(client.getOutputStream());
            output.writeUTF("");
            DataInputStream input = new DataInputStream(client.getInputStream());
            String a =input.readUTF().toString();
            client.close();
            return a ;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }

    }
}