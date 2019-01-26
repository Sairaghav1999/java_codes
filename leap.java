class leap
{
    public static void main(String args[])
	{
        int a=2000;
        boolean l=false;
        if(a%4==0)
        {
            if(a%100==0)
            {
                if(a%400==0)
                l=true;
            }
            else
            l=true;
        }
        System.out.println(l);
    }

}