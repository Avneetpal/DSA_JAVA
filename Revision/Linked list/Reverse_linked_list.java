class link 
{
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
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
        head=newnNode;


    }
    public void reve()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while (curr!=null) {
            
        
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        }
        head=prev;

    }
    public void print()
    {
        Node temp=head;
        while (temp!=null) 
        {
            System.out.println(temp.data);
            temp=temp.next;
            
        }
    }
}

public class Reverse_linked_list {
    public static void main(String[] args) {
        link ll=new link();
        ll.addf(1);
        ll.addf(5);
        ll.addf(7);
        ll.addf(6);
        ll.addf(8);
        ll.reve();
        ll.print();

        
    }
    
}
