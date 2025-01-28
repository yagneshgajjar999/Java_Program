import java.net.URL;
public class UrlExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            UrlExample url=new UrlExample(); 
            System.out.println("Protocol:"+url.getProtocol());
            System.out.println("Host:"+url.getHost());
            System.out.println("Part"+url.getPart());
            System.out.println("Path:"+url.getPath());
            System.out.println("Query:"+url.getQuery());
            System.out.println("File:"+url.getFile());
            System.out.println("Ref(Anchor)"url.getRef());
        } 
        catch (Exception e) 
        {
            System.out.println("Malformed URL:"+e.getMessage());
        }
    }
}
