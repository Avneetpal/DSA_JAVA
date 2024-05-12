import java.util.Stack;

class push_bottom 
{
    public static void bottom(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        bottom(s, data);
        s.push(top);
    }
}

public class push_at_bottom {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(5);
        s.push(6);
        s.push(9);
        s.push(10);
        push_bottom.bottom(s,4);
        while (!s.isEmpty()) 
        {
            System.out.println(""+s.peek());
            s.pop();
            
        }

    }

}
