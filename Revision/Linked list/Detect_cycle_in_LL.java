class cycle 
{
    public static class Node 
    {
        Node next;
        int data;
        Node(int data)
        {
            this.next=null;
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;
    public void addf(int data)
    {
        Node newnNode=new Node(data);
        if(head==null)
        {
            head=tail=newnNode;
            return;
        }
        newnNode.next=head;
        head=newnNode;
    }
    public void createcycle(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
        }
        tail.next=newNode;
        newNode.next=head.next.next;

    }
    public boolean detect_cycle()
    {
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) 
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

public class Detect_cycle_in_LL {
    public static void main(String[] args) {
        cycle c=new cycle();
        c.addf(5);
        c.addf(4);
        c.addf(7);
        c.addf(8);
        c.addf(8);
        c.createcycle(4);
        System.out.println(c.detect_cycle());
    }
}
