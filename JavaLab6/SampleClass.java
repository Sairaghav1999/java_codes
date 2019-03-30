package JavaLab6;

import java.io.*;
import java.rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.*;
import java.rmi.server.UnicastRemoteObject;
public class SampleClass extends UnicastRemoteObject implements Sample
{
public SampleClass()throws RemoteException
{
}
public boolean checkMultiple(int a,int b)
{
    if(a%b==0 || b%a==0)
return true;
return false;
}
public int checkObject(Object a,Object b)
{
if(a.equals(b)) return 1;
else if(a==b) return 0;
return -1;
}
}