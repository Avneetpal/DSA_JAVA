import java.util.*;
class push 
{
    public void bottom(Stack<Integer> s, int n)
    {
        if(s.isEmpty())
        {
            s.push(n);
            return;
        }
        int top=s.pop();
        bottom(s, n);
        s.push(top);
    }
}

public class Push_at_bottom_of_stack 
{
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();
        s.push(5);
        s.push(6);
        s.push(7);
        push p=new push();
        p.bottom(s, 1);
        System.out.println(s);
    }
    
}
