class palindrome 
{
    public static node head;
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
        if(head==null)
        {
            System.out.println("empty");
            return;

        }
        node temp=head;
        while (temp!=null) 
        {
            System.out.print(" ->"+temp.data);
            temp= temp.next;
        }
        System.out.println();
    }
    //using slow fast method to find mid
    public node mid()
    {
        node slow=head;
        node fast=head;
        while (fast!=null && fast.next!=null) 
        {
            slow=slow.next;
            fast=fast.next.next;

            
        }
        return slow;
    }
    public boolean palindrom()
    {
        node midnode=mid();
        // 2nd half
        node prev=null;
        node curr=midnode;
        node next;
        while (curr!=null) 
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        node right=prev;// right head
        node left=head;// left head
        while (right!=null) {
            if(right.data!=left.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
            
        }
        return true;
    }
    
}
public class check_whether_LL_palindrome {
    public static void main(String[] args) {
        palindrome p=new palindrome();
        p.addf(5);
        p.addf(4);
        p.addf(3);
        p.addf(4);
        p.addf(5);
        p.print();
        System.out.println(p.palindrom());
      
    }
    
}
