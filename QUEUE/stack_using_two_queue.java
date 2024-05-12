import java.util.*;
import java.util.LinkedList;
class stack
{
    public static Queue<Integer> q1=new LinkedList<>();
    public static Queue<Integer> q2=new LinkedList<>();
    public static boolean isEmpty()
    {
        return q1.isEmpty();
    }
    public static void add(int data)
    {
        
        while (!q1.isEmpty()) 
        {
            q2.add(q1.remove());
            
        }
        q1.add(data);
        while (!q2.isEmpty()) 
        {
            q1.add(q2.remove());
            
        }
    }
    public static void remove()
    {
        if(q1.isEmpty())
        {
            
            return;
        }
        q1.remove();
    }
    public static void print()
    {
        if(q1.isEmpty())
        {
            System.out.println("empty");
            return;
        }

        while (!q1.isEmpty()) 
        {
            System.out.println(""+q1.peek());
            q1.remove();
            
        }
    }
}

public class stack_using_two_queue {
    public static void main(String[] args) {
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.print();
        
    }
    
}
