class LL_Stack 
{
    public static class  Node 
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
    public static class Stack
    {
    public boolean isempty()
    {
        return head==null;
    }
    public void push(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=tail=null;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public int peek()
    {
        if(isempty())
        {
            System.out.println(" empty");
            return Integer.MIN_VALUE;
        }
        return head.data;
    }
    public void pop()
    {
        if(isempty())
        {
            return;
        }
        head=head.next;

    }
}
}

public class stack_using_LL {
    public static void main(String[] args)
     
    {
     LL_Stack.Stack ll=new LL_Stack.Stack();
     ll.push(5);
     ll.push(80);
     ll.push(8);
     while (!ll.isempty()) 
     {
      System.out.print(ll.peek());
      ll.pop();  
     }
    }
    
}
