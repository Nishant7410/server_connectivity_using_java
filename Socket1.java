import java.net.*;
import java.io.*;
public class Socket1
{
    public static void main(String ar[])throws IOException
    {
    
            Socket s=new Socket("whois.internic.net",43);
            InputStream is=s.getInputStream();
            OutputStream os=s.getOutputStream();
            String name="rediff.com"+"\n";
            os.write(name.getBytes());
                while(true)
                {
                    int x=is.read();
                    if(x==-1)
                        break;
                    System.out.print((char)x);
                }
            s.close();
    }
}