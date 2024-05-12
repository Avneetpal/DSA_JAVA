import java.util.*;
import java.util.LinkedList;
class stack_using 
{
    public static Deque<Integer> q=new LinkedList<>();
    public static void push(int data)
    {
        q.addLast(data);
    }
    public static int pop()
    {
        return q.removeLast();
    }
    public static int peek()
    {
        return q.peekLast();
    }
   
}
class Stack_using_deque 
{
    public static void main(String[] args) {
        
        stack_using.push(1);
        stack_using.push(2);
        stack_using.push(3);
        stack_using.push(4);
        stack_using.push(5);
        stack_using.push(6);
       System.out.println(""+stack_using.peek());

}
}