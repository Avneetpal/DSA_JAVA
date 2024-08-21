import java.util.*;
class reversal 
{
    public void reverse(Queue<Integer> q)
    {
        Stack<Integer> s=new Stack<>();
        while (!q.isEmpty()) 
        {
            s.push(q.remove());
            
        }
        while (!s.isEmpty()) 
        {
         q.add(s.pop());   
        }

    }
    public void print(Queue<Integer> q)
    {
        while (!q.isEmpty()) 
        {
         System.out.println(q.peek());
         q.remove();   
        }
    }
}

public class queue_reversal {
    public static void main(String[] args) 
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        reversal r=new reversal();
        r.reverse(q);
        r.print(q);
    }
}
