import java.util.*;
class queue
{
    public static void main(String[] args) {
        //PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder()); 
        // used wto print in reverse order
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.add(5);
        q.add(1);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) 
        {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
}