import java.io.*;
import java.net.*;
public class Def2_client 
{
    public static void main(String[] args) 
    {
        try
        {
            // Create a socket to connect to the server
            Socket socket=new Socket("localhost",12345);
            // Create input and output streams for communication with the server
            BufferedReader inputFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter outputToServer = new PrintWriter(socket.getOutputStream(),true);
            // Send two numbers to the server
            outputToServer.println("5");
            outputToServer.println("8");
            // Receive and print the squares from the server
            System.out.println(inputFromServer.readLine());
            System.out.println(inputFromServer.readLine());
            // Close the connection with the server
            socket.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
