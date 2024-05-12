import java.util.*;
class rev 
{
    public static void rever(Stack<Integer> s)
    {
        Stack<Integer> n=new Stack<>();
        while (!s.isEmpty()) 
        {
            n.push(s.peek());
            s.pop();
            
        }
       while (!n.isEmpty()) 
       {
        System.out.println(""+n.peek());
        n.pop();
        
       }
        
    }
}
class reversere
{
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
       rev.rever(s);
    }
}