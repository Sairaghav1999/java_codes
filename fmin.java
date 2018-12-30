import java.io.*;
class fmin {
    public static double min(double[] arr)
    {
        int i;
        double m=arr[0];
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]<m)
            {
                m=arr[i];
            }
        }
        return m;
    }
    public static void main(String arg[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of entries: ");
        int n=Integer.parseInt(br.readLine());
        int i;
        double arr[]=new double[n];
        System.out.println("Enter the numbers");
        for(i=0;i<n;i++)
        {
            arr[i]=Double.parseDouble(br.readLine());                        
        }                 
        double m=min(arr);
        System.out.println("Minimum Number: "+m);
    }
}