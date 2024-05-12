import java.util.*;
class find 
{
    public static void permutation(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(""+ans);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            // "abcdf"= "ab"+"cd" after removing c
            String newst=s.substring(0, i)+s.substring( i+1);
            permutation(newst, ans+curr);
        }
        
    }
}



public class find_permutation_in_string {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String st=a.nextLine();
        find.permutation(st, "");
        a.close();
    }
}
