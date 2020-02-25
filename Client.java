import java.io.*;
import java.net.*;

public class Client
{
    static String ipAdresse = "127.0.0.1";

    public static void senden (String name, String nachricht)
    {
        System.out.println("Funktionsaufruf");
        try
        {
            Socket client = new Socket(ipAdresse, 5000);
            DataOutputStream output = new DataOutputStream(client.getOutputStream());
            output.writeUTF(name + " :\t" + nachricht);
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
        System.out.println("Chatabfrage");
        try
        {
            Socket client = new Socket(ipAdresse, 5001);
            DataInputStream input = new DataInputStream(client.getInputStream());
            client.close();
            return input.toString();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
        
    }
}