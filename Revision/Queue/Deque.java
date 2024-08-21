// double ended queue
import java.util.*;
 class Deque_ {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(2);
        d.addLast(5);
        d.addFirst(55);
        d.addLast(6);
        d.removeFirst();
        d.removeLast();
        System.out.println(d);
        System.out.println("first   "+d.getFirst());
        System.out.println("last  "+d.getLast());
    }
    
}
