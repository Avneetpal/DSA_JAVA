class reverse 
{
    public static node head;
    public static node tail;
    public static class node 
    {
        int data;
        node next;
        public node(int data)
        {
            this.data=data;
            this.next=null;

        }
    }
    public void addf(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("empty");
            return;

        }
        node temp=head;
        while (temp!=null) 
        {
            System.out.print("->"+temp.data);
            temp= temp.next;
        }
        System.out.println();
    }
    public void rev()
    {
        node prev=null;
        node curr=tail=head;
        node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;// reverse step
            prev=curr;
            curr=next;
        }
       head=prev;

    }
   
}



public class reverse_linked_list {
    public static void main(String[] args) {
        reverse r=new reverse();
        r.addf(5);
        r.addf(4);
        r.addf(3);
        r.addf(2);
        r.addf(1);
        r.print();      
        r.rev();
        r.print();
    }
    
}
