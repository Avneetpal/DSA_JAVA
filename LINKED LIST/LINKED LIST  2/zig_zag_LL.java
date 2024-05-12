class ll 
{
    public static node head;
    public static node tail;
    public static class node
    {
         int data;
         node next;
         public node (int data)
         {
            this.data= data;
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
        node temp=head;
        while (temp!=null) 
        {
            System.out.print("->"+temp.data);
            temp=temp.next;
        }
        System.out.println();    
    }
    
    public void zigzag()
    {
        // find mid
       node slow=head;
       node fast=head;
       while (fast!=null&&fast.next!=null) 
       {
        slow=slow.next;
        fast=fast.next.next;  
       }
       node mid =slow;
        // reverse
        node curr=mid.next;
        mid.next=null;
        node prev=null;
        node next;
        while (curr!=null) 
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        node left=head;// left head
        node right =prev;// right head
        node nextL,nextR;
        // final step
        while (left!=null && right!=null) 
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            right=nextR;
            left=nextL;
         }
    }
}
public class zig_zag_LL {
    public static void main(String[] args) {
        ll l=new ll();
        l.addf(1);
        l.addf(2);
        l.addf(3);
        l.addf(4);
        l.addf(5);
        l.print();
        l.zigzag();
        l.print();
    } 
}
