import java.util.*;


class stack_array
{
   
    
        ArrayList<Integer> ll=new ArrayList<>();
        // to check empty
        public boolean isempty()
        {
            return ll.size()==0;
        }
        // pop
        public void pop(int a)
        {
            ll.add(a);
        }
        public int push()
        {
            int top=ll.get(ll.size()-1);
            ll.remove(ll.size()-1);
            return top;
        }
        // peek to see top
        public int peek()
        {
            return ll.get(ll.size()-1);
        }

    }

class MAIN 
{
    public static void main(String[] args) {
        stack_array s=new stack_array();
       s.pop(1);
       s.pop(2);
       s.pop(3);
       while (!s.isempty()) 
       {
        System.out.println(s.peek());
            s.push();
     }
       
    }
}