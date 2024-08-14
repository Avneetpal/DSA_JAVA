class array 
{
    static class queue
    {
        static int rear;
        static int arr[];
        static int size;
        queue(int n)
        {
            arr=new int[n];
            rear=-1;
            size=n;

        }
        public static boolean isempty()
        {
            return rear==-1;
        }
        public void add(int n)
        {
            if(rear==size-1)
            {
                System.out.println("queue is full");
                return ;
            }
            rear=rear+1;
            arr[rear]=n;
        }
        public void remove()
        {
            if(isempty())
            {
                System.out.println("queue is empty");
                return;
            }
            //int front=arr[0];
            for(int i=0;i<size-1;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;

        }
        public int peak()
        {
            if(isempty())
            {
                System.out.println("empty");
                return -1;
            }
            return arr[0];
        }
        public void print()
        {
            for(int i=0;i<size-1;i++)
            {
                if(isempty())
                {
                    return;
                }
                System.out.println(peak());
                remove();
            }
        }
    }

}
class Main 
{
    public static void main(String[] args) {
        array.queue a=new array.queue(5);
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        a.remove();
        a.print();

        
    }
}