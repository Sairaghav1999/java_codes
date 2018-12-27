import java.io.*;
class pattern5
{
    public static void main(String arg[]) throws IOException
    {
        BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the value of n: ");
        int n=Integer.parseInt(br.readLine());
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+" ");
            }
            for(k=1;k<=n-i+n-1-i;k++)
            {
                System.out.print("*"+" ");
            }

            System.out.println();
        }
    }
}