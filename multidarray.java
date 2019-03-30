import java.util.*;
class multidarray{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,n,x,j;
        int[][] jarr_arr=new int[4][];
         for( i=0;i<4; i++){
            System.out.println("Enter number of students in Batch "+(i+1));
            x=sc.nextInt();
            n=(x/4)+((x/4)*4==x?0:1);
            jarr_arr[i]=new int[n];
            for(j=0;j<n;j++,x-=4) jarr_arr[i][j]=x>4?4:x;
        }
        System.out.println("\n\n");
        int t=0;
        for( i=0;i<4; i++){
            System.out.println("Batch "+(i+1));
            for(j=0;j<jarr_arr[i].length;j++){
                System.out.print(jarr_arr[i][j]+", ");
                if(jarr_arr[i][j]==4) t++;
            }
            System.out.println();
        }
        System.out.println("\n\nTotal Number of Full Groups:"+t);
    }
}