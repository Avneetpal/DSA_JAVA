import java.util.*;
// for character in array we know that at 0 =a,1=b.......
class Dublicate 
{
    public void dublicatee (String s,int index,boolean map[],StringBuilder sb)
    {
        if(index==s.length())
        {
            System.out.println(sb);
            return;
        }
        char currchar=s.charAt(index);
        if(map[currchar-'a']==true)
        {
            dublicatee(s, index+1, map, sb);

        }
        else
        {
            map[currchar-'a']= true;
            dublicatee(s, index+1, map, sb.append(currchar));
        }
    }
}
public class dublicate_in_string {
    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
        String s=new String();
        s=a.next();
        Dublicate d=new Dublicate();
        d.dublicatee(s, 0,new boolean [26], new StringBuilder(""));
        a.close();
    }
    
}
