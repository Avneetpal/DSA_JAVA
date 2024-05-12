import java.util.*;
import java.util.LinkedList;
public class queue_using_javaframework {
    public static void main(String[] args) {
        //Queue<Integer> q=new ArrayDeque<>();// both can be used to make a queue
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) 
        {
            System.out.println(""+q.peek());
            q.remove();
            
        }

    }
    
}
