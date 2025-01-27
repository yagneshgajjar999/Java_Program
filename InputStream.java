import java.io.*;
public class InputStream
{
    public static void main(String[] args)
    {
        String filepath = "InputStream.txt";
        try(FileInputStream fileinputstream = new FileInputStream(filepath))
        {
            int content;
            while((content=fileinputstream.read()) != -1)
            {
                System.out.print((char)content);
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occured while reading the file");
        }
    }
}
