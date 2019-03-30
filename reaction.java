public class reaction {
    public static void main(String[] args){
        String s=args[0];
        s=s.trim();
        int l,i,j;
        l=s.length();
        String r="",p="",k="";
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)=='-' && s.charAt(i+1)=='>')
            {
                break;
            }
            else
            {
                r=r+s.charAt(i);
            }
            
        }
        for(j=i+2;j<l;j++)
            {
                p=p+s.charAt(j);
            }
        r=r.trim();
        p=p.trim();
        r=r+" ";
        p=p+" ";
        System.out.print("Reactants are");
        for(i=0;i<r.length();i++)
        {
            if(r.charAt(i)==' ' || r.charAt(i)=='+')
            {
                k=k.trim();
                if(Character.isDigit(k.charAt(0)))
                {
                    System.out.print(" "+k.charAt(0)+" moles of "+k.substring(1));
                }
                else
                {
                    System.out.print(" 1 mole of "+k);
                }
                k="";
            }
            else
            {
                k=k+r.charAt(i);
        }           
        
    }
        System.out.print(".\n");
        k="";
    System.out.print("Products are");
        for(i=0;i<p.length();i++)
        {
            if(p.charAt(i)==' ' || p.charAt(i)=='+')
            {
                k=k.trim();
                if(Character.isDigit(k.charAt(0)))
                {
                    System.out.print(" "+k.charAt(0)+" moles of "+k.substring(1));
                }
                else
                {
                    System.out.print(" 1 mole of "+k);
                }
                k="";
            }
            else
            {
                k=k+p.charAt(i);
        }           
        
    }
        System.out.print(".\n");
    
}
}
