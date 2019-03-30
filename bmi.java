class student 
{
    String fname, lname;
    double h,w, bmi;
    student(String fname, String lname, double h, double w)
    {
        this.fname=fname;
        this.lname=lname;
        this.h=h;
        this.w=w;
    }
    private void calculate_bmi()
    {
        bmi=w/(h*h);
    }
    public void check_bmi()
    {
        calculate_bmi();
        if(bmi<18.5)
        {
            System.out.println("BMI is "+bmi+"\n"+fname+" "+lname+" is underweight.\n");
        }
        else if(bmi<25)
        {
            System.out.println("BMI is "+bmi+"\n"+fname+" "+lname+" is healthy.\n");
        }
        else if(bmi<30)
        {
            System.out.println("BMI is "+bmi+"\n"+fname+" "+lname+" is overweight.\n");
        }
        else
        {
            System.out.println("BMI is "+bmi+"\n"+fname+" "+lname+" is obese.\n");
        }
    }
}
class bmi
{
    public static void main(String args[])
    {
        String fname, lname;
        double h,w;
        //System.out.println("Enter first name, last name, height (in metres) and weight (in kg)");
        fname=args[0];
        lname=args[1];
        h=Double.parseDouble(args[2]);
        w=Double.parseDouble(args[3]);
        student s1= new student(fname,lname,h,w);
        s1.check_bmi();
    }
}