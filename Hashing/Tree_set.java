import java.util.*;
public class Tree_set 
{
    public static void main(String[] args) 
    {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("asdfghj");
        ts.add("zxcvbn");
        ts.add("bnmj");
        ts.add("asdfghjyhb");
        for (String string : ts) 
        {
         System.out.println(string);   
        }
    }
    
}
