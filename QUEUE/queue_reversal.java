import java.util.*;
import java.util.LinkedList;
class reverse
{
    public static void revers(Queue<Integer> q)
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
}


public class queue_reversal {
    public static void main(String[] args) {
        Scanner sy=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<=5;i++)
        {
            int a=sy.nextInt();
            q.add(a);
        }
        reverse.revers(q);
        System.out.println();
        System.out.print(""+q);
        // while (!q.isEmpty()) 
        // {
        //     System.out.print(" "+q.peek());
        //     q.remove();
            
        // }
        sy.close();
    }
    
}
