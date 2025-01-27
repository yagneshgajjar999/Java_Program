import java.io.*;
public class OutputStream
{
    public static void main(String[] args)
    {
        String filepath = "OutputStream";
        String content="Hello How are you?";
        try(FileOutputStream fileOutputStream=new FileOutputStream(filepath)) 
        {
            byte[] contentBytes = content.getBytes();
            fileOutputStream.write(contentBytes);
            System.out.println("File written successfully");
        } 
        catch (IOException e)
        {
            System.out.println("An error occured while writing to the file");
        }
    }
}
