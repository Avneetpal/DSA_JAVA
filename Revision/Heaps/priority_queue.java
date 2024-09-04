import java.util.*;
class prirority_queue
{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(5);
        pq.add(8);
        pq.add(9);
        pq.add(1);
        while (!pq.isEmpty()) 
        {
            System.out.println(pq.peek());
            pq.remove();
            
        }
    } 
}