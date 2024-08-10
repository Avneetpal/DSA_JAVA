class doubly 
{
    public static class Node 
    {
        Node next;
        int data;
        Node prev;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public  static Node tail;
    public static int size;
    public void addf(int data)
    {
        Node newnNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnNode;
            return;
        }
        newnNode.next=head;
        head.prev=newnNode;
        head=newnNode;

    }
    public void removefirst()
    {
        if(head==null)
        {
            System.out.println("empty");
            return;
        }
        if(size==1)
        {
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }
    public void addlast(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        tail.next=null;
    }
    public void removelast()
    {
        if(head==null)
        {
            System.out.println("empty");
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }
    public void print()
    {
        Node temp=head;
        while (temp!=null) 
        {
            System.out.print("<-->"+temp.data);
            temp=temp.next;
            
        }
    }
}

public class Doubly_LL {
    public static void main(String[] args) {
        doubly dd=new doubly();
        dd.addf(5);
        dd.addf(6);
        dd.addf(8);
        dd.addf(9);
        dd.addf(5);
        dd.addlast(8);
        dd.addlast(12);
        dd.removefirst();
        dd.removelast();
        dd.print();
    }
    
}
