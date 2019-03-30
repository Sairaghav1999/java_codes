import java.util.*;
class Vote extends Thread
{
    static int[][] a=new int[3][80];
    static int[] count=new int[3];
    static
    {
        Random r=new Random();
        for(int i=0;i<3;i++)
        for(int j=0;j<80;j++)
        {
            a[i][j]=r.nextInt(3)+1;
        } 
    }
    int l,h,r;
    Vote(String name,int r, int l,int h)
    {
        this.r=r;
        this.l=l;
        this.h=h;
        System.out.println(name+" started");
        start();
    }
    public void run()
    {
        synchronized(this)
        {
            for(int j=l;j<h;j++)
            count[r]+=a[r][j];
        }
    }
    int count(int i)
    {
        return count[i];
    }
}
class Vote_Main
{
    public static void main(String[] args) 
    {
        Double d;
        Vote v1=new Vote("T1",0,0,80);
        Vote v2=new Vote("T2",1,0,40);
        Vote v3=new Vote("T3",1,40,50);
        Vote v4=new Vote("T4",2,0,80);
        int c1=v1.count(0);
        int c2=v2.count(1);
        int c3=v4.count(2);
        if(c1>c2 && c1>c3)
        System.out.println("A Wins By "+c1);
        else if(c2>c3 && c2>c1)
        System.out.println("B Wins By "+c2);
        else
        System.out.println("C Wins By "+c3);
    }
}
