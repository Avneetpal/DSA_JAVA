import java.util.*;
class MAin 
{
    public static void main(String[] args) {
        LinkedList<Integer> ll =new LinkedList<>();
        ll.addFirst(5);
        ll.addLast(6);
        ll.add(9);
        System.out.println(ll);
        ll.remove();
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
}