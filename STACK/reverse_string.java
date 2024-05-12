import java.util.*;
class reverse 
{
    public  static String revers(String str)
    {
        Stack<Character> s=new Stack<>();
        int idx=0;
      while (idx!=str.length()) 
      {
        char c=str.charAt(idx);
        s.push(c);
        idx++;
    }
    StringBuilder result=new StringBuilder();
    while (!s.empty()) {
        result.append(s.peek());
        s.pop();
        
    }
    return result.toString();
}
}

public class reverse_string 
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String s=a.nextLine();
        System.out.println(""+reverse.revers(s));
        a.close();
    }
    
}
