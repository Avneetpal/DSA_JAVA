import java.util.*;
public class stack_using_java_collection_framework {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(5);
        s.push(6);
        s.push(10);
        s.push(15);
        while (!s.isEmpty()) 
        {
            System.out.println(""+s.peek());
            s.pop();

        }
        
    }
    
}
