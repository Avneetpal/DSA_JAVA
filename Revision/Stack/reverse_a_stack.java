import java.util.*;
class revstack 
{
    public void Push_at_bottom_of_stack(Stack<Integer> s, int n)
    {
        if(s.isEmpty())
        {
            s.push(n);
            return;
        }
        int top=s.pop();
        Push_at_bottom_of_stack(s, n);
        s.push(top);
    

    }
    public  void rev( Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        rev(s);
        Push_at_bottom_of_stack(s, top);
        //System.out.println(s);


    }
}

public class reverse_a_stack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(5);
        s.push(4);
        s.push(7);
        s.push(1);
        System.out.print(s);
        revstack r=new revstack();
        System.out.println();
        r.rev(s);
        System.out.println(s);
    }
    
}
