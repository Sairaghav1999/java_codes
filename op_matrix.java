import java.io.*;
class op_matrix {
    static int n1=0,n2=0,m1=0,m2=0;
    public static double[][] multiplyMatrix(double[][] a, double[][] b)
    {
        double[][] c = new double[n1][m2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < n2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c; 
    }
    public static double[][] sumMatrix(double[][] a, double[][] b)
    {
        double[][] c = new double[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
        return c;

    }
    public static double[][] subtractMatrix(double[][] a, double[][] b)
    {
        double[][] c = new double[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                    c[i][j] = a[i][j] - b[i][j];
                }
            }
        return c;

    }
    public static void main(String arg[]) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows of matrix A");
        n1=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns of matrix A");
        m1=Integer.parseInt(br.readLine());
        int i,j;
        double arra[][]=new double[n1][m1];
        System.out.println("Enter the entries");
        for(i=0;i<n1;i++)
        {
            for(j=0;j<m1;j++)
            {
                arra[i][j]= Double.parseDouble(br.readLine());
            }
        }
        System.out.println("Enter the number of rows of matrix B");
        n2=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns of matrix B");
        m2=Integer.parseInt(br.readLine());
        double arrb[][]=new double[n2][m2];
        System.out.println("Enter the entries");
        for(i=0;i<n2;i++)
        {
            for(j=0;j<m2;j++)
            {
                arrb[i][j]= Double.parseDouble(br.readLine());
            }
        }
        double add_arr[][]=new double[n1][m1];
        double sub_arr[][]=new double[n1][m1];
        double mul_mat[][]= new double[n1][m2];
        System.out.println("Enter the entries");
        int c=1;
        do{
            System.out.println("Press\n 1 for adding matrices\n 2 for multiplying matrices\n 3 for subtracting matrices\n 0 to exit");
            c=Integer.parseInt(br.readLine());
            switch(c)
            {
                case 1:
                if(n1==n2 && m1==m2)
                {
                    add_arr=sumMatrix(arra, arrb);
                    for(i=0;i<n1;i++)
                    {
                        for(j=0;j<m1;j++)
                        {
                            System.out.print(add_arr[i][j]+" ");
                        }
                        System.out.println();
                    }
                }
                else
                {
                    System.out.println("Addition not possible");
                } 
                break;
                case 2:
                if(m1==n2)
                {
                    mul_mat=multiplyMatrix(arra, arrb);
                    for(i=0;i<n1;i++)
                    {
                        for(j=0;j<m2;j++)
                        {
                            System.out.print(mul_mat[i][j]+" ");
                        }
                        System.out.println();
                    }
                }
                else
                {
                    System.out.println("Multiplication not possible");
                }                
                break;
                case 3:
                if(n1==n2 && m1==m2)
                {
                    sub_arr=subtractMatrix(arra, arrb);
                    for(i=0;i<n1;i++)
                    {
                        for(j=0;j<m1;j++)
                        {
                            System.out.print(sub_arr[i][j]+" ");
                        }
                        System.out.println();
                    }
                }
                else
                {
                    System.out.println("Subtraction not possible");
                } 
                break;
                case 0:
                System.out.println("Thank You!");
            }
        }while(c!=0);
        
    }
}