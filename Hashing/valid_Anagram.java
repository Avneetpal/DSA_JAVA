import java.util.*;
class Anagram 
{
    public static Boolean valid_anagram(String s1, String s2)
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        if(s1.length()!=s2.length())
        {
            return false;
        }
        for(int i=0;i<s1.length();i++)
        {
            char a=s1.charAt(i);
            if(hm.containsKey(a))
            {
                hm.put(a, hm.get(a)+1);
            }
            else
            {
                hm.put(a, 1);
            }

        }
        for(int i=0;i<s2.length();i++)
        {
            char c=s2.charAt(i);
            if(hm.containsKey(c) && hm.get(c)>0 )
            {
                hm.put(c, hm.get(c)-1);
                if(hm.get(c)==0)
                {
                    hm.remove(c);
                } 
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
public class valid_Anagram {
    public static void main(String[] args) {
        String s1="race";
        String s2="cre";
        System.out.println(Anagram.valid_anagram(s1, s2));
    }
    
}
