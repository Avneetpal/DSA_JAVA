import java.util.*;
/**
 * Basic_operations_in_arrayList
 */
public class Basic_operations_in_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(""+list);
        list.remove(2);
        System.out.println(""+list);
        list.set(1, 10);
        System.out.println(""+list);
        System.out.println(""+list.contains(1));
        //list.get(0);
        System.out.println(""+list.get(0));
        System.out.println(""+list.size());

    }

    

}