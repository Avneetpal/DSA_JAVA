class LinkedList 
{
    static class node 
    {
        int data;
        node next;
        public node (int data)
        {
            this.data=data;
            this.next=null;

        }
        static class queue
        {
            static node head=null;
            static node tail=null;
            public static boolean isEmpty()
            {
                return head==null & tail==null;
            }
            public static void add(int data)
            {
                node newnode=new node(data);
                if(isEmpty())
                {
                    head=tail=newnode;
                }
               tail.next=newnode;
               tail=newnode;
            }
            public static  int peek()
            {
                if(isEmpty())
                {
                    return -1;
                }
                return head.data;
            }
            public static int size()
            {
                node temp=head;
                int size=0;
                while (temp!=null) 
                {
                    temp=temp.next;
                    size++;
                }
                return size;
            }
            public static void remove()
            {
                if(isEmpty())
                {
                    System.out.println("empty");
                    return ;
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
        }
    }
}



public class Queue_using_linkedList {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        LinkedList.node.queue q=new LinkedList.node.queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        while (!q.isEmpty()) 
        {
            System.out.println(q.peek());
            q.remove();
            
        }
       
       
       
    }
    
}
