import java.io.*;

public class Buffered_Reader 
{
    public static void main(String[] args) 
    {
        String Filepath = "Buffered_Reader.txt";
        try(BufferedReader reader =  new BufferedReader(new FileReader(Filepath)))
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        } 
        catch (IOException e)
        {
            System.out.println("An error Eccurred while reading thie file");
        }
    }
}
