class merge 
{
    public static class Node 
    {
        Node next;
        int data;
        Node( int data)
        {
            this.next=null;
            this.data=data;
        }

    }
    public static Node head;
    public static Node tail;
    public void addf(int data)
    {
        Node newnNode =new Node(data);
        if(head==null)
        {
            head=tail=newnNode;
            return;
        }
        newnNode.next=head;
        head=newnNode;
    }
    public Node mergesort(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node midnoNode=mid(head);
        // divdie into two parts
        Node righhead=midnoNode.next;
        midnoNode.next=null;

        Node newleft=mergesort(head);
        Node newright= mergesort(righhead);
        return mergee(newright, newleft);

        
    }
    public Node mergee(Node head1, Node head2)
    {   
        Node mergedll=new Node(-1);
        Node temp=mergedll;
        while (head1!=null && head2!=null) 
        {
            if(head1.data<=head2.data)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else
            {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
            
        }
        while (head1!=null) 
        {
            temp.next=head1;
              head1=head1.next;
              temp=temp.next;
            
        }
        while (head2!=null) 
        {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;   
        }
        return mergedll.next;

    }
    public Node mid(Node head)
    {
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next!=null) 
        {
            fast=fast.next.next;
            slow=slow.next;
            
        }
        return slow;
    }
    public void print()
    {
        Node temp=head;
        while (temp!=null) 
        {
            System.out.print("->"+temp.data);
            temp=temp.next;
            
        }
        System.out.println();
    
    }
}


public class merge_sort_in_LL 
{
    public static void main(String[] args) {
        merge m=new merge();
        m.addf(5);
        m.addf(8);
        m.addf(7);
        m.addf(1);
        m.addf(6);
        m.addf(1);
        merge.head=m.mergesort(merge.head);
        m.print();
    }
    
}
