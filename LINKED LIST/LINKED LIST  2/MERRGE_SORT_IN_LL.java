
//import java.util.*;
class merge 
{
    public static  node head;
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
        node newnode =new node(data);
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
        node temp=head;
        while (temp!=null) 
        {
            System.out.print("->"+temp.data);
            temp=temp.next;
            
        }
        System.out.println();
    }
    // slow fast method 
    public node mid(node head)
    {
        node slow=head;
        node fast=head.next;// . next is used beacuse we have to take 1 half mid in even
        while (fast!=null&&fast.next!=null) 
        {
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
    }
    public node mergesort(node head )
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        // find mid
        node midnode=mid(head);
        //divdie in two parts
        node righthead=midnode.next;
        midnode.next=null;
        node newleft=mergesort(head);
        node newright=mergesort(righthead);
        //step 3
        return merg(newleft, newright);
    }
    private node merg(node head1, node head2)
    {
        node mergedll=new node(-1);
        node temp=mergedll;
        while (head1!=null&&head2!=null) 
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
           return mergedll.next;// because merged ke head pe -1 hai
            
        

    }
}

public class MERRGE_SORT_IN_LL {
    public static void main(String[] args) {
        merge m=new merge();
        m.addf(5);
        m.addf(8);
        m.addf(3);
        m.addf(9);
        m.addf(2);
        m.print();
        merge.head=m.mergesort(merge.head);
        m.print();
       // System.out.println(m.mergesort(null));

    }
    
}
