class linkk 
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
    public static int size=0;
    public  void addf(int data)
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
    public  void find(int k)
    {
        if(k==size)
        {
            head=head.next; // if nth node is head
        }
        int i=1;
        int index=size-k;// to find from start
        Node prev=head;
        while (i<index) 
        {
            prev=prev.next;
            i++;

            
        }
        prev.next=prev.next.next;
        return;


         
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


public class find_and_remove_nth_node_from_end 
{
 
    public static void main(String[] args) 
    {
        linkk ll=new linkk();
        ll.addf(1);
        ll.addf(5);
        ll.addf(7);
        ll.addf(6);
        ll.addf(8);
        ll.find(3);
        ll.print();
    }
}
