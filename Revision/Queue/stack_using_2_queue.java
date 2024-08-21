import java.util.*;
class stack 
{
  public Queue<Integer> q=new LinkedList<>();
  public Queue<Integer> q2=new  LinkedList<>();
  public boolean isEmpty()
  {
    return q.isEmpty();
  }
  public void add(int a)
  {
    while (!q.isEmpty()) 
    {
     q2.add(q.remove());   
    }
    q.add(a);
    while (!q2.isEmpty()) 
    {
     q.add(q2.remove());   
    }

  } 
  public int peek()
  {
    return q.peek();
  } 
  public void remove()
  {
    if(isEmpty())
    {
        return;
    }
    q.remove();
  } 
  public void print()
  {
    while (!q.isEmpty()) 
    {
     System.out.println(q.peek());
     q.remove();   
    }
  }
}
class Queuuue{
    public static void main(String[] args) {
        stack s=new stack();
        s.add(5);
        s.add(8);
        s.add(9);
        s.add(7);
        s.print();

    }
}