import java.util.*;
class pall2
{
    public boolean pal2(String s)
    {
        int i=0;
        for(i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            return false;
        }
        return true;

    }
}



public class palindrome2 {
    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
        String s=new String();
        s=a.next();
        pall2 pp=new pall2();
        if(pp.pal2(s)==true)
        {
            System.out.println("palindrome");
        }

        else
        System.out.println("not palindrome");
        a.close();

    }
}
    

