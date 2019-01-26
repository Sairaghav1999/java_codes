import java.io.*;
class gcd {
    public static void main(String arg[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the 2 numbers: ");
        int n1, n2, gcd = 1;
        n1=Integer.parseInt(br.readLine());
        n2=Integer.parseInt(br.readLine());
        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
    }
}