class linkedlist 
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
    public static class stack 
    {
        public  static boolean isempty()
        {
            return head==null;
        }
        public static void push(int data)
        {
            node newnode=new node(data);
            if(isempty())
            {
                head=newnode;
                return;
            }
           newnode.next=head;
           head=newnode;
        }
        public static int peek()
        {
            return head.data;
        } 
        public static void pop()
        {
            if(isempty())
            {
                System.out.println("stack is empty");
                return;
            }
            head=head.next;

        }
    }
}


public class stack_using_linked_list {
    public static void main(String[] args) {
        linkedlist .stack.push(1);
        linkedlist .stack.push(2);
        linkedlist .stack.push(3);
        linkedlist .stack.push(4);
        linkedlist .stack.push(5);
        while (!linkedlist.stack.isempty()) 
        {
            System.out.println(linkedlist.stack.peek());
            linkedlist.stack.pop();
            
        }
        


    }
    
}
