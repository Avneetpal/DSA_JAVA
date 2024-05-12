class circular 
{
    static class Circular_queue 
    {
        static int size;
        static int arr[];
        static int rear;
        static int front;
        Circular_queue(int n)
        {
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty()
        {
            return rear==-1;
        }
        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("queue is full");
                return ;
            }
            // 1st element
            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return arr[front];
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
                int result=arr[front];
            // if last element
            if(rear==front)
            {
                rear=front=-1;
            }
            else
            {
                front=(front+1)%size;
            }
            return result;

        }
    }
}
public class Circular_queue_using_array {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        circular.Circular_queue q=new  circular.Circular_queue(5);
    
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.add(6);
        q.add(7);
        System.out.println();
        while (!q.isEmpty()) 
        {
            System.out.println(q.peek());
            q.remove();
            
        }

        
    }    
}
