import java.util.*;;
class arraystack 
{
    ArrayList<Integer> ll =new  ArrayList<>();
    public boolean isempty()
    {
        return ll.size()==0;
    }
    public void push(int a)
    {
        ll.add(a);
    }
    public void pop()
    {
        ll.remove(ll.size()-1);
    }
    public int peek()// show top element
    {
        return ll.get(ll.size()-1);
    }
}
class stack 
{
    public static void main(String[] args) {
        arraystack a=new arraystack();
        a.push(5);
        a.push(6);
        a.push(7);
        a.push(3);
       while (!a.isempty()) 
       {
        System.out.println(a.peek());
        a.pop();
        
       }
    }
}