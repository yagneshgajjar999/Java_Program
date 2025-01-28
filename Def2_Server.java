import java.io.*;
import java.net.*;
public class Def2_Server 
{

    public static void main(String[] args) 
    {
        try 
        {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server listening on port 12345....");
            while (true) 
            {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected from:"+clientSocket.getInetAddress().getHostAddress());
                BufferedReader inputFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter outputToClient = new PrintWriter(clientSocket.getOutputStream(),true);
                // Read two numbers from the client
                int num1 = Integer.parseInt(inputFromClient.readLine());
                int num2 = Integer.parseInt(inputFromClient.readLine());
                // Send the squares back to the client
                int square1 = num1*num1;
                int square2 = num2*num2;
                // Close the squares back to the client
                outputToClient.println("Square of"+num1 + ":" + square1);
                outputToClient.println("Square of"+num2 + ":" + square2);
                clientSocket.close();
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
