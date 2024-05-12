import java.util.*;
class reverse_best 
{
    public static void push_at_bottom(Stack<Integer> s,int n)
    {
        if(s.isEmpty())
        {
            s.push(n);
            return;
        
        }
        int top=s.pop();
        push_at_bottom(s,n );
        s.push(top);

    }
    public static void rever(Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        rever(s);
        push_at_bottom(s, top);
        print(s);

    }
    
    public static void print(Stack<Integer> s)
    {
        while (!s.isEmpty()) 
        {
            System.out.println(""+s.pop());
           
            
        }
    }
}





public class reverse_stack_best_method {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(9);
        s.push(10);
       // reverse_best.print(s);
        reverse_best.rever(s);
        //reverse_best.print(s);
    }
    
}
