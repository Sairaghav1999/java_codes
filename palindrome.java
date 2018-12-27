import java.io.*;
import java.math.*;
class palindrome {
    public static void main(String arg[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer:");
        int n=Integer.parseInt(br.readLine());
        int x=n;
        int s=0,a;
        while(x!=0)
        {
            a=x%10;
            x=x/10;
            s=(s*10)+a;
            System.out.println("s ="+s);
            System.out.println("a ="+a);
            a=0;
        }
        System.out.println(s);
    }
}