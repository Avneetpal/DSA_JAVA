import java.util.*;
class DequeJCF 
{
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.print(""+deque);
        deque.removeLast();
        System.out.println(deque);
        deque.addLast(5);
        deque.addLast(6);
        System.out.println(deque);
       System.out.println(deque.peekFirst());
       System.out.println(deque.peekLast());
       

        
    }
}
