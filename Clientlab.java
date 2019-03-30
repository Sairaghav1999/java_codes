import java.io.*; 
import java.net.*;
public class Clientlab
{
    public static void main(String args[])
    {
        try
        {
            Socket s=new Socket("127.0.0.1",1300);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            OutputStream os=s.getOutputStream();
            PrintStream pr=new PrintStream(os);
            String data;
            String check;
            data=br.readLine();
            check=br.readLine();
            pr.println(data);
            pr.println(check);
            BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
            String output=br1.readLine();
            System.out.println(output);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}