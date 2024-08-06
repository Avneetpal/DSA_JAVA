import java.util.*;
class Linkedlist{
public static class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
    public static int size=0;
    public static Node head;
    public static Node tail;
    // add first
    public void addf(int data)
    {
        Node newNode=new Node(data);
        size++;

        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // add last
    public void addlast(int data)
    {   
        Node newnNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnNode;
            return;
        }
        tail.next=newnNode;
        tail=newnNode;

    }
    //add mid
    public void mid(int data, int idx)
    {
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i<idx-1) 
        {
            temp=temp.next;
            i++;
            
        }
        newNode.next=temp.next;
        temp.next=newNode;


    }
    // print
    public void print()
    {
        Node temp=head;
        while (temp!=null) 
        {
            System.out.println(temp.data);
            temp=temp.next;
            
        }
    }
    // remove first
    public void remove()
    {
        //int val=head.data;
        head=head.next;
        size--;
    }
    // remove last
    public void removelast()
    {
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
           
        }
        prev.next=null;
        tail=prev;
        size--;
    }

}


class MAIN 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linkedlist ll=new Linkedlist();
        ll.addf(3);
        ll.addf(2);
        ll.addlast(5);
        ll.addlast(6);
        ll.mid(8, 2);
        ll.remove();
        ll.removelast();
        
        System.out.println("Size   "+Linkedlist.size);
        ll.print();
        sc.close();
    }
}