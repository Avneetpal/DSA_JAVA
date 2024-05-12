import java.util.*;
class subset 
{
    public static void set(String s,String ans,int i)
    {
        if(i==s.length())
        {
            if(ans=="")
            {
                System.out.println("null");
                return;
            }
            else
            System.out.println(""+ans);
            return;
        }
        // if choice is yes
        set(s, ans+s.charAt(i), i+1);
        // if choice is no
        set(s, ans, i+1);
    }
    
}
public class find_subset_in_string {
 public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    String s=a.nextLine();
    subset.set(s, "", 0);
    a.close();
 }   
}
