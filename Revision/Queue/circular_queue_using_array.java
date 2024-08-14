class circular_queue 
{
    public static class queue
    {
        public static int rear;
        public static int size;
        public static int arr[];
        public static int  front;
        queue(int n)
        {
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public boolean isfull()
        {
            return (rear+1)%size==front;

        }
        public boolean isempty()
        {
            return rear==-1;
        }
        public void addf(int data)
        {
            if(isfull())
            {
                System.out.println("full");
                return;
            }
            // adding first element 
            if(front==-1)
            {
                front=0;
            } 
            rear=(rear+1)%size;
            arr[rear]=data;           
        }
        public void remove()
        {
            if(isempty())
            {
                System.out.println("is empty");
                return;
            }
            if(rear==front)
            {
                rear=front=-1;
            }
            else
            {
                front=(front+1)%size;
            }
        }
        public int peek()
        {
            if(isempty())
            {
                return-1;

            }
            return arr[front];
        }
        public void print()
        {
            if(isempty())
            {
                return;
            }
            while (!isempty()) 
            {
                System.out.println(peek());
                remove();   
            }
        }
    }
}

public class circular_queue_using_array {
    public static void main(String[] args) {
        circular_queue.queue q=new circular_queue.queue(5);
        q.addf(6);
        q.addf(7);
        q.addf(9);
        q.addf(2);
        q.addf(7);
        q.remove();
        q.addf(1);
        q.print();
    }
    
}
