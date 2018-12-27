import java.io.*;
class pattern6
{
    public static void main(String arg[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of n:");
        int n= Integer.parseInt(br.readLine());
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" "+" ");
            }
            for(k=1;k<=(2*i-1);k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        n=n-1;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n-i+1;j++)
            {
                System.out.print(" "+" ");
            }
            for(k=1;k<=(2*i-1);k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}