import java.util.*;
class Non_repeating 
{
    public void Non_repeatin(String str)
    {
        Queue<Character> q=new LinkedList<>();
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            Character ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while (!q.isEmpty() && freq[q.peek()-'a']>1) 
            {
             q.remove();   
            }
            if(q.isEmpty())
            {
                System.out.println(-1);
            }
            else{
                System.out.println(q.peek());
            }

        }
        System.out.println();
    }
}

public class first_non_repeating {
    public static void main(String[] args) {
        String str="aabccxb";
        Non_repeating n=new Non_repeating();
        n.Non_repeatin(str);
    }
    
}
