import java.io.*;
import java.net.*;

public class Client
{
    public static void main (String[]args)
    {
        try
        {
            Socket client = new Socket("127.0.0.1", 5000);
            DataOutputStream output = new DataOutputStream(client.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            output.writeUTF(reader.readLine());
            DataInputStream input = new DataInputStream(client.getInputStream());
            System.out.println(input.readUTF());
            client.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
}