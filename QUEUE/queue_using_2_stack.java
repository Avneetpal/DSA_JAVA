import java.util.*;
class twoStack
{
    public static Stack<Integer> s1=new Stack<>();
    public static Stack<Integer> s2=new Stack<>();
    public static boolean isEmpty()
    {
        return s1.isEmpty();
    }
    public static void add(int data)
    {
        while (!s1.isEmpty()) 
        {
            s2.push(s1.pop());
            
        }
        s1.push(data);
        while (!s2.isEmpty()) 
        {
            s1.push(s2.pop());
            
        }
    }
    public static void remove()
    {
        if(s1.isEmpty())
        {
            System.out.println("queue is empty");
            return;
        }
        s1.pop();
    }
    public static void print()
    {
        if(s1.isEmpty())
        {
            return;
        }
        while (!s1.isEmpty()) 
        {
            System.out.println(""+s1.peek());
            s1.pop();
            
        }
    }

   
}


public class queue_using_2_stack {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
    twoStack t=new twoStack();
    t.add(5);
    t.add(4);
    t.add(3);
    t.add(2);
    t.add(1);
    t.print();    

    }
 
}
