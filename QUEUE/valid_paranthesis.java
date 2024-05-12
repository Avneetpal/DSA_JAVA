// quetion from stack '
// using .hasNext function 
import java.util.*;
class Check
{
    public static Boolean paranthesis(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            Character c=str.charAt(i);
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
                else if(c==')'&&s.peek()=='('||c=='}'&&s.peek()=='{'||c==']'&&s.peek()=='[')
                {
                    s.pop();
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
 class paran 
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        while(a.hasNext())
        {
            String s=a.next();
            System.out.println(Check.paranthesis(s));
           
        }
        a.close();

    }
}




