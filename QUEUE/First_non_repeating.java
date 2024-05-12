import java.util.*;
import java.util.LinkedList;
class non_repeating 
{
    public static void repeat(String s)
    {
        Queue<Character> q=new LinkedList<>();
        char [] freq=new char[26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            q.add(c);
            freq[c-'a']++;
            while (!q.isEmpty() && freq[q.peek()-'a']>1) 
            {
                q.remove();
            
            }
            if(q.isEmpty())
            {
                System.out.println(-1+"");
            }
            else
            {
                System.out.println(""+q.peek());
            }
        }

    }
}



public class First_non_repeating {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String s=a.nextLine();
        non_repeating.repeat(s);
        a.close();
    }
    
}
