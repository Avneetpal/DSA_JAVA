import java.util.*;
class dublicate 
{
    public static boolean dublic(String str)
    {
        Stack<Character> s=new Stack<>();   
        for(int i=0;i<str.length();i++)
        {
            
            char c=str.charAt(i);
            // closing 
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
                    return true;// dublicate
                }
                else
                {
                    s.pop();
                }
            }
            // opening
            else
            {
                s.push(c);
            }
        }
        return false;
    }

}
public class Dublicate_paranthesis 
{
    public static void main(String[] args) {
        
        String str="(((a)+b)+c)";
        String str2="(((a)+b))";
        System.out.println(dublicate.dublic(str));
        System.out.println(dublicate.dublic(str2));
    }
    // true =dublicate
    // false =not dublicate
    
}
