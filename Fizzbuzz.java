import java.io.*;
class Fizzbuzz {
    public static void main(String arg[]) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of digits: ");
        int n=Integer.parseInt(br.readLine());
        int i=0;
        for(i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            System.out.println("FizzBuzz");
            else
            if(i%3==0)
            System.out.println("Fizz");
            else
            if(i%5==0)
            System.out.println("Buzz");
            else
            System.out.println(i);
        }
    }
}