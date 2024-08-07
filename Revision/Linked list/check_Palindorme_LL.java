class Linkee 
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
    public void addf(int data)
    {
      Node newnNode=new Node(data);
      if(head==null)
      {
        head=tail=newnNode;
        return;
      }  
      newnNode.next=head;
      head=newnNode;
      
    }
    // using slow fast method
    public Node mid()
    {
        Node slow=head;
        Node fast =head;
        while (fast!=null && fast.next!=null) 
        {
            fast=fast.next.next;
            slow=slow.next;   
        }
        return slow;


    }
    public boolean checkPalindrome()
    {
        Node prev=null;
        Node curr=mid();
        Node next;
        while (curr!=null) 
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

            
        }
        Node right=prev;// right half
        Node left=head;// left half
        while (right!=null) 
        {
            if(right.data!=left.data)
            {
                return false;
            }
            right=right.next;
            left=left.next;
            
        }
        return true;
    }
}






public class check_Palindorme_LL {
    public static void main(String[] args) {
        Linkee ll=new Linkee();
        ll.addf(5);
        ll.addf(3);
        ll.addf(2);
        ll.addf(3);
        ll.addf(5);
        System.out.println(ll.checkPalindrome());
    }
    
}
