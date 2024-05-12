
class linkedlist
{
    public static node head;
    public static node tail;
    public static class node
    {
        int data;
        node next;
        public node (int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    // add first
    public void addfirst(int data)
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
    //add last
    public void addlast(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=null;
        tail=newnode;
    }
    // add mid
    public void addmid(int data,int index)
    {
        node newnode=new node(data);
        if(index==0)
        {
            addfirst(data);
            return;
        }
        node temp=head;
        int i=0;
        while (temp!=null &&i<index-1) 
        {
            temp=temp.next;
            i++;
        }
        if(temp==null || temp.next==null)
        {
            System.out.println("invalid index");
            return;
        }

        newnode.next=temp.next;
        temp.next=newnode;

    }

    public void printll()
    {
        if(head==null)
        {
            System.out.println("empty");
            return;
        }
        node temp=head;
        while (temp!=null) 
        {
            System.out.print(" ->"+temp.data);
            temp=temp.next;
        }
        System.out.println();

    }
    public int removefirst()
    {
        int val=head.data;
        head=head.next;
        return val;
    }
    public int size()
    {
        node temp=head;
        int size=0;
        while (temp!=null) 
        {
            size++;
            temp=temp.next;

        }
        return size;

    }
    public void removelast()
    {
     

        node prev=head;
        for(int i=0;i<size()-2;i++)
        {
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
    }

}
public class create_linked_list 
{
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addfirst(5);
        ll.addfirst(2);
        ll.addfirst(6);
        ll.printll();
        ll.addlast(9);
        
         ll.printll();
        System.out.println(ll.size());
         ll.addmid(16,2);
        ll.removefirst();
        ll.printll();

         ll.removelast();
        ll.printll();
    }
}
