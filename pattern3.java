import java.io.*;
class pattern3 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the value of n:");
        int n= Integer.parseInt(br.readLine());
        int i,j;
        System.out.println("===========================");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(i=1;i<=n-1;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}