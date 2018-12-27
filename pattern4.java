import java.io.*;
import java.math.*;
class pattern4
{
    public static void main(String arg[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of n:");
        int n= Integer.parseInt(br.readLine());
        int i,j,k,m,p,q;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" "+"  ");
            }
            for(k=0;k<i;k++)
            {
                p=(int) Math.pow(2,k);
                System.out.print(p+"  ");
            }
            if(i!=1)
            {
                for(m=i-2;m>=0;m--)
                {
                    q=(int) Math.pow(2,m);
                    System.out.print(q+"  ");
                }
            }
            System.out.println();
        }
    }
}