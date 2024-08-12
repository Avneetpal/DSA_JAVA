import java.util.*;
class valid 
{
    public boolean checkvalid(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='('||c=='['||c=='{')
            {
                s.push(c);
            }
            else
            {
                if(s.isEmpty())
                {
                    return false;
                }
                if(c==')'&&s.peek()=='('|| c==']'&& s.peek()=='[' || c=='}' && s.peek()=='{')
                {
                    s.pop();
                }
                else
                {
                    return false;
                }
            }
            
        }
        if(s.isEmpty())
            {
                return true;
            }
        else
            {
                return false;
            }
    }
}

public class valid_paranthesis {
    public static void main(String[] args) {
        String str="[({})]";
        valid v=new valid();
        System.out.println(v.checkvalid(str));
        

    }
    
}
