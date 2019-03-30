package JavaLab6;

import java.io.*;
import java.rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.*;
import java.io.*;
import java.rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.io.*;
import java.util.*;
class Student implements Serializable
{
String name,id;
Student(String n, String i)
{
System.out.println(n+" "+i);
name=n;id=i;
}
}
public class SampleClient
{
public static void main(String[] args)
{
try
{
int cho=0;
do
{
    System.out.println("Enter level: ");
Scanner sc=new Scanner(System.in);
//int case;
Sample
sa=(Sample)Naming.lookup("rmi://localhost//Acess");
cho=sc.nextInt();
switch(cho)
{
case 1:
int a,b;
System.out.println("Enter two numbers:");
a=sc.nextInt();
b=sc.nextInt();
System.out.println(sa.checkMultiple(a,b));
break;
case 2:
Student o1= new Student("Kritika","16BCI0041");
System.out.println(o1.name+" "+o1.id);
Student o2 = o1;
Student o3= new Student("Smruti","16BCE0112");
System.out.println("Object 1 and 2:\n"+sa.checkObject(o1,o2));
System.out.println("Object 1 and 3:\n"+sa.checkObject(o1,o3));
break;
}
}while(cho!=3);
}
catch(Exception e)
{
System.out.println(e);
}
}
}