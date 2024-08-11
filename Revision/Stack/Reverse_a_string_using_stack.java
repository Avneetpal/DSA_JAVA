import java.util.*;
class reverse 
{
    public String rev(String str)
    {
       Stack<Character> s=new Stack<>();
       int idx=0;
       while (idx!=str.length()) 
       {
        s.push(str.charAt(idx));
        idx++;
       } 
       StringBuilder result =new StringBuilder();
       while (!s.isEmpty()) 
       {
        result.append(s.peek());
        s.pop();
        
       }
       return result.toString();
    }
}

public class Reverse_a_string_using_stack {
    public static void main(String[] args) {
        String s="STACK";
        reverse r=new reverse();
        System.out.println(r.rev(s));

    }
    
}
