public class linkedlist {
    node head;
    public void insert(int item)
    {
        node nd =new node(item);
        if(head==null)
        {
            head=nd;
        }
        else 
        {
            node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=nd;
        } 
        show();
    }
    public void show()
    {
        node n=head;
        while(n!=null)
        {
            System.out.print(n.data+"\t");
            n=n.next;
        }
        System.out.println();
    }
    public void insertAt(int loc, int item)
    {
        int c=1;
        node nd=new node(item);
        node tmp=new node();
        if(head==null)
        {
            head=nd;
        }
        else 
        {
            node n=head;
            while(n.next!=null)
            {
                if(c==loc)
                {
                    tmp.next=n.next;
                    n.next=nd;
                    nd.next=tmp.next;
                    break;
                }
                c++;
            }
        }
        show();
    }
    public void insertAtStart(int item)
    {
        node nd =new node(item);
        if(head==null)
        {
            head=nd;
        }
        else 
        {
            node tmp= new node();
            tmp=head;
            head=nd;
            nd.next=tmp;
        }
        show();
    }
    public void deleteAt(int loc)
    {
        if(head==null) 
        {
           System.out.println("Empty list!"); 
        }
        else
        {
            if(loc==1)
            {
                head=head.next;
            }
            else
            {
                node n=head;
                int c=1;
                node prev=new node();
                while(n!=null)
                {
                    if(c==loc)
                    {
                        prev.next=n.next;
                    }
                    prev=n;
                    n=n.next;
                    c++;
                }
            }
            show();
        }     
    }
    public void deleteKey(int item)
    {
        if(head==null) 
        {
           System.out.println("Empty list!"); 
        }
        else
        {
            node n=head;
            node prev=new node();
            while(n!=null)
            {
                if(n.data==item)
                {
                    prev.next=n.next;
                }
                prev=n;
                n=n.next;
            }
        }
        show();
    }
    public void reverselinkedlist()
    {
        
    }
}