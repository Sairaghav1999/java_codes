import java.io.*;
class stringReversal
{
    public static void main(String arg[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String:");
        String s= br.readLine();
        String fs="";
        int i,l;
        char a;
        l=s.length();
        for(i=l-1;i>=0;i--)
        {
            fs=fs+s.charAt(i);
        }
        System.out.println("Reversed String: "+fs);
    }
}