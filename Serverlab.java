import java.io.*; 
import java.net.*;
public class Serverlab
{
    static int carry=0;
    public static String addbin(String a,String b)
    {
        char[] temp1;
        char[] temp2;
        char[] ans=new char[16];
        int t3;
        temp1=a.toCharArray();
        temp2=b.toCharArray();
        for(int i=15;i>=0;i--)
        {
        int t1=Integer.parseInt(temp1[i]+""); 
            char[] temp22 = temp2;
            int t2 = Integer.parseInt(temp22[i] + "");
        t3=t1^t2^carry;
        ans[i]=Integer.toString(t3).charAt(0);
        if((t1==1&&t2==1)||(t1==1&&carry==1)||(t2==1&&carry==1))
        {
            carry=1;
            //System.out.println("Carry incr"+ i);
            carry=0;
        }
        else
            carry=0;
        }
        String fin=new String(ans);
        //System.out.println(carry);
        return fin;
    }
    public static String complement(String a)
    {
        a=a.replace('0','*'); 
        a=a.replace('1','0'); 
        a=a.replace('*','1'); 
        return a;
    }
    public static void main(String args[])
    {
        try
        {
            String output;
            ServerSocket s=new ServerSocket(1300);
            Socket ss=s.accept();
            InputStream is=ss.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String data=br.readLine(); //data contains the input data sent by client
            String check=br.readLine(); //check contains checksum header
            //now checksum calculation starts
            String[] arr=new String[10];
            int j=0;
            int a=data.length()/16;
            int b=data.length()%16;
            for(int i=0;i<16*a;i+=16)
            {
                arr[j]=data.substring(i,i+16);
                j+=1;
            }
            arr[j]=data.substring(16*a,data.length());
            String sum="0000000000000000"; //starting sum value initialised to 16 0s
            for(int k=0;k<j;k++)
            {
                while(arr[k].length()!=16)
                {
                    arr[k]="0"+arr[k];
                }
                sum=addbin(sum,arr[k]);
                while(carry!=0)
                {
                    carry=0;
                    String temp="0000000000000001";
                    sum=addbin(sum,temp);
                }
            }
            String calc_check=complement(sum);
            if(calc_check.equals(check))
            {
                output="Data unaltered";
            }
            else
            output="Data altered";
            OutputStream os=ss.getOutputStream();
            //OutputStreamReader osr=new OutputStreamReader(os);
            PrintStream pr=new PrintStream(os);
            pr.println(output);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
