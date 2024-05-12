import java.util.*;
public class convertToUpperCase 
{
    public static String c(String s)
    {
        StringBuilder sb=new StringBuilder("");
        char c=Character.toUpperCase(s.charAt(0));
        sb.append(c);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==' '&& i<s.length()-1)
            {
                sb.append(s.charAt(i));
                i++;
                c=Character.toUpperCase(s.charAt(i));
                sb.append(c);
             }
             else
             sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        
        Scanner a=new Scanner(System.in);
        String s=new String();
        s=a.nextLine();
        System.out.println(c(s));
       
       System.out.println();
       a.close();
    }
    
}
