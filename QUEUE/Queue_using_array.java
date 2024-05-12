class queue_array
{
    static class queue
    {
        static int rear;
        static int size;
        static int arr[];
        queue(int n)
        {
            arr=new int[n];
            size=n;
            rear=-1;

        }
        public static boolean isEmpty()
        {
            return rear==-1;
        }
        public  static void add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;

        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("empty");
                return -1 ;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear =rear-1;
            return front;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("empty");
                return -1;
            }
            return arr[0];
        }
    }
}
class MAIN 
{
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        queue_array.queue q=new queue_array.queue(5);
        queue_array.queue.add(1);
        queue_array.queue.add(2);
        queue_array.queue.add(3);
        queue_array.queue.add(4);
        queue_array.queue.add(5);
        while (!queue_array.queue.isEmpty()) 
        {
            System.out.println(""+queue_array.queue.peek());
            queue_array.queue.remove();
            
        }

    }
}