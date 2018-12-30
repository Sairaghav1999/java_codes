import java.io.*;
import java.math.*;
class fpalindrome {
    // Return the reversal of an integer, i.e. reverse(456) returns 654
    public static int reverse(int x) {
        int s=0,a;
        while(x!=0)
        {
            a=x%10;
            x=x/10;
            s=(s*10)+a;
            a=0;
        }
        return s;
    }
    // Return true if number is palindrome
    public static boolean isPalindrome(int n) {
        int r= reverse(n);
        if(r==n)
        return true;
        else
        return false;

    }
    public static void main(String arg[]) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number:");
        int n=Integer.parseInt(br.readLine());
        boolean a=isPalindrome(n);
        if(a)
        System.out.println("Palindrome!");
        else
        System.out.println("Not a Palindrome!");
    }
}
