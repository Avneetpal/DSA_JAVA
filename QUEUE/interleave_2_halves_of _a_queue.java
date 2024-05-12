import java.util.*;
import java.util.LinkedList;
class halve
{
    public static void half(Queue<Integer> q)
    {
        int size=q.size()/2;
        Queue<Integer> first= new ArrayDeque<>();
        for(int i=0;i<size;i++)
        {
            first.add(q.remove());
        }
        while (!first.isEmpty()) 
        {
            q.add(first.remove());
            q.add(q.remove());
            
        }

        
    }
}
class Interleave
{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Scanner sy=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            int a=sy.nextInt();
            q.add(a);
        }
        halve.half(q);
        System.out.println();
        while (!q.isEmpty()) 
        {

            System.out.print(" "+q.peek());
            q.remove();
        }
        sy.close();
    }
}