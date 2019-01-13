import java.io.*;
class op_matrix {
    public static double[][] multiplyMatrix(double[][] a, double[][] b)
    {

    }
    public static double[][] sumMatrix(double[][] a, double[][] b)
    {

    }
    public static double[][] subtractMatrix(double[][] a, double[][] b)
    {

    }
    public static void main(String arg[]) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows of matrix A");
        int n1=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns of matrix A");
        int m1=Integer.parseInt(br.readLine());
        int i,j;
        double arr[][]=new double[n1][m1];
        System.out.println("Enter the entries");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]= Double.parseDouble(br.readLine());
            }
        }
        System.out.println("Enter the number of rows of matrix B");
        int n2=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns of matrix B");
        int m2=Integer.parseInt(br.readLine());
        int i,j;
        double arrb[][]=new double[n1][m1];
        //double add_arr[][]=new double[n][m];
        //double sub_arr[][]=new double[n][m];
        System.out.println("Enter the entries");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]= Double.parseDouble(br.readLine());
            }
        }
        int c=1;
        do{
            System.out.println("Press\n 1 for adding matrices\n 2 for multiplying matrices\n 3 for subtracting matrices\n 0 to exit");
            c=Integer.parseInt(br.readLine());
            switch(c)
            {
                case 1:
                add_arr[][]=sumMatrix(arr, b);
                break;
                case 2:
                break;
                case 3:
                break;
                case 0:
                System.out.println("Thank You!");
            }
        }while(c!=0)
        
    }
}