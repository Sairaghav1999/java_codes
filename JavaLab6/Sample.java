package JavaLab6;

import java.io.*;
import java.rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.*;
public interface Sample extends Remote
{
boolean checkMultiple(int a,int b)throws RemoteException; 
int checkObject(Object a,Object b)throws RemoteException;
}