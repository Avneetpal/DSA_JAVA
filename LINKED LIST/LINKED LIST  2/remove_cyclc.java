class remove 
{ public static node head;
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
    public void remov()
    {
        // step 1 detect cycle
        node slow=head;
        node fast =head;
        boolean cycle=false;
        while (fast!=null&& fast.next!=null) 
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                cycle=true;
                break;
            }
            
        }
        if(cycle==false)
        {
            return;
        }
        // step 2 find node
        slow=head;
        node prev=null;
        while (slow!=fast) 
        {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
            
        }
        // step 3 remove cycle
        prev.next=null;

    }
}
public class remove_cyclc {
    public static void main(String[] args) {
        remove r=new remove();
        r.addf(5);
        r.addf(4);
        r.addf(3);
        r.addf(2);
        r.addf(1);
        r.makingcyclic(6);
        r.remov();
        r.print();
        

    }
    
}
