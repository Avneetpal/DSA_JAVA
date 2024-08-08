import java.util.LinkedList;

public class LL_from_java_collection_framework {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(5);
        ll.addFirst(1);
        ll.addLast(7);
        ll.add(3);
        ll.add(66);
        ll.remove();
        ll.remove(1);
        System.out.println(ll);
    }
    
}
