class detect
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
            System.out.println(""+temp.data);
            temp= temp.next;
        }
    }
    public void makingcyclic(int data)
    {
        node newnode = new node(data);
        if(head==null)
        {
            head=tail=newnode;
        }
       tail.next=newnode;
       newnode.next=head.next.next;

    }
    public boolean detec()
    {
        node slow=head;
        node fast=head;
        while (fast!=null&&fast.next!=null) 
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
            
        }
        return false;

    }
}
 public class Check_cyclic_LL 
{
    public static void main(String[] args) 
    {
        detect d=new detect();
        d.addf(1);
        d.addf(2);
        d.addf(3);
        d.addf(4);
        d.addf(5);
        d.makingcyclic(6);
        System.out.println(d.detec());
       
    }

}
