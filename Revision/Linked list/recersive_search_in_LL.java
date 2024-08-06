class Linked 
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
    public static Node  head;
    public static Node tail;
    public void addf(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public int recursive_search(int k)
    {
        return helper(head,k);

    }
    public int helper(Node head, int key)
    {
        if(head==null)
        {
            return -1;

        }
        if(head.data==key)
        {
            System.out.println("found");
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1)
        {
            return 0;
        }
        return idx+1;


    }
}
public class recersive_search_in_LL {
    public static void main(String[] args) {
        Linked ll=new Linked();
        ll.addf(1);
        ll.addf(5);
        ll.addf(7);
        ll.addf(6);
        ll.addf(8);
      System.out.println(  ll.recursive_search(5));
    }
    
}
