import java.util.*;
import java.util.LinkedList;
class queue 
{
    static Deque<Integer> q=new LinkedList<>();
    public static void push(int data)
    {
        q.addLast(data);
    }
    public static int pop()
    {
        return q.pollFirst();
    }
   public static int peek()
   {
        return q.peekFirst();
   } 
}



public class queue_using_deque {
    public static void main(String[] args) {
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.peek());

    }
    
}
