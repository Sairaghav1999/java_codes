import java.io.*;

import jdk.internal.jline.internal.InputStreamReader;
interface sports
{
    public int sprt_crd=0;
}
class students
{
    public int reg_no;
    public String name;
    public String course;
    public void getValues() {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Registration Number, Name and Course");
        reg_no=Integer.parseInt(br.readLine());
        name=br.readLine();
        course=br.readLine();
    }
}
class academics extends students implements sports 
{
    public   
}