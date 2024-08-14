class LL_queue
{
    public static class Node 
    {
        Node next;
        int data;
        Node(int data)
        {
            this.next=null;
            this.data= data;
        }

        
    }
    public static class queue 
    {
        Node head=null;
        Node tail=null;
        public boolean isempty()
        {
            return head==null & tail==null;
        }
        public void addf(int data)
        {
            Node newnode=new Node(data);
            if(isempty())
            {
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public void remove()
        {
            if(isempty())
            {
             System.out.println("empty");
             return;   
            }
            if(head==tail)
            {
                head=tail=null;
            }
            else
            {
                head=head.next;
            }
        }
        public int peek()
        {
            return head.data;
        }
        public void print()
        {

            while (!isempty()) 
            {
                System.out.println(peek());
                remove();
            }
        }
    }
}


public class queue_using_LL {
    public static void main(String[] args) {
        LL_queue.queue a= new LL_queue.queue();
        a.addf(5);
        a.addf(6);
        a.addf(7);
        a.addf(3);
        a.remove();
        a.print();
        
    }
    
}
