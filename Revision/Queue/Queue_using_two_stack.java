

import java.util.*;
class queue_using
{
    static class queue 
    {
        public static Stack<Integer> s1=new Stack<>();
        public static Stack<Integer> s2=new Stack<>();
        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }

        public static void add(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) 
            {
             s1.push(s2.pop());   
            }
        }
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return s1.peek();
        }
        public static void remove()
        {
            if(isEmpty())
            {
                System.out.println("empty");
                return;
            }
            s1.pop();
        }
    }
}

public class Queue_using_two_stack {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        queue_using.queue q=new queue_using.queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) 
        {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
    
}
