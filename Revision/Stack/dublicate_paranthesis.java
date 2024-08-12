import java.util.*;
class dublicate 
{
    public boolean check(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c==')')
            {
                int count=0;
                while (s.peek()!='(') 
                {
                    s.pop();
                    count++;    
                }
                if(count<1)
                {
                    return true; // dublicate
                }
                else
                {
                    s.pop();
                }
            }
            else
            {
                s.push(c);
            }
        }
        return false;
    }
}


public class dublicate_paranthesis {
    public static void main(String[] args) {
        
        String str="(((a+h)+f))";
        dublicate d=new dublicate();
        System.out.println(d.check(str));// true means dublicate 
    }
    
}
