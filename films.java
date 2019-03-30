import java.io.*;
class film{
    public String name;
    public String lead_actor;
    public String language;
    public String category;        //action/drama/fiction/comedy
    public int duration;
    film(){
        name= "Demo Film";
        lead_actor= "XYZ";
        language="English";
        category="drama";
        duration=30;
    }
    film(String name,String lead_actor, String language, String category, int duration){
        this.name=name;
        this.language=language;
        this.lead_actor=lead_actor;
        this.category=category;
        this.duration=duration;
    }
    @Override
    public String toString()
    {
        return (name+"\t"+lead_actor+"\t"+language+"\t"+category+"\t"+duration);
    }
    public void setValues(String name,String lead_actor, String language, String category, int duration)
    {
        this.name=name;
        this.language=language;
        this.lead_actor=lead_actor;
        this.category=category;
        this.duration=duration;
    }
    
    
}
public class films {
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        film f1[]= new film[5];
        int i=0;
        // nm,la,lng,cat;
        //int dur;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter name, lead actor, language, category and duration");
            f1[i] =new film();
            f1[i].name=br.readLine();
            f1[i].lead_actor=br.readLine();
            f1[i].language=br.readLine();
            f1[i].category=br.readLine();
            f1[i].duration= Integer.parseInt(br.readLine());
            
        }
        int p=0,d=0,k=0;
        System.out.println("All English Movies with Arnold:");
        for(i=0;i<5;i++)
        {
            if((f1[i].language).equalsIgnoreCase("English") && (f1[i].lead_actor).equalsIgnoreCase("Arnold")) {
            if(k==0)
            {
                d=f1[i].duration;
                p=i;
            }
            else
            {
                if(f1[i].duration<d)
                {
                    d=f1[i].duration;
                    p=i;
                }
            }
            
            k++;
        }
        }
        if(k==0)
        {
            System.out.println("None Found\n");
        }
        else {
            System.out.println(f1[p]);
        }
        k=0;
        System.out.println("All Tamil Movies with Rajini:");
        for(i=0;i<5;i++)
        {
            if((f1[i].language).equalsIgnoreCase("Tamil") && (f1[i].lead_actor).equalsIgnoreCase("Rajini")) {
            System.out.println(f1[i]);
            k++;
        }
        }
        if(k==0)
        {
            System.out.println("None Found\n");
        }
        k=0;
        System.out.println("All Comedy Movies:");
        for(i=0;i<5;i++)
        {
            if((f1[i].category).equalsIgnoreCase("comedy")) {
            System.out.println(f1[i]);
            k++;
        }
        }
        if(k==0)
        {
            System.out.println("None Found\n");
        }
        System.out.println("ALL MOVIES:\n");
        for(i=0;i<5;i++)
        {
            System.out.println(f1[i]);
        }
    }
}