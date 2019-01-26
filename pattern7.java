import java.io.*;
public class pattern7 {
    public static void main(String[] args) throws IOException {
        int i=0,j=0,p=0,k=0;
        for(i=6;i>=1;i--)
        {
            for(k=0;k<=p;k++){
                System.out.print(" "+" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            p++;
        } 
    }   
}

