import java.io.*;
import java.util.*;
class Donor implements Serializable
{
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    String address;
    String contact;
    String group;
    int dold;
    Donor(String name,int age,String address,String contact,String group,int dold)
    {
        this.name=name;
        this.age=age;
        this.address=address;
        this.contact=contact;
        this.group=group;
        this.dold=dold;
    }
    public String toString()
    {
        return "name is "+name+" age is "+age+" address is "+address;
    }
}
public class DonorMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of donors");
        int n = sc.nextInt();
        sc.nextLine();
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("1.txt"));
            Donor[] d=new Donor[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter name");
                String name=sc.nextLine();
                System.out.println("Enter age");
                int age=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter address");
                String address=sc.nextLine();
                System.out.println("Enter contact");
                String contact= sc.nextLine();
                System.out.println("Enter group");
                String group=sc.nextLine();
                System.out.println("Enter date of last donation");
                int dold= sc.nextInt();
                sc.nextLine();
                d[i] = new Donor(name,age,address,contact,group,dold);
                oos.writeObject(d[i]);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        try
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("1.txt"));
            for(int i=0;i<n;i++)
            {
                Donor d=(Donor)ois.readObject();
                if(d.group.equals("A+ve") && d.dold>=6)
                System.out.println(d);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}