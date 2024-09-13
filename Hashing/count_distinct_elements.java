import java.util.*;
public class count_distinct_elements 
{
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        int num[]={1,2,3,1,3,2,5,3,1,4,2,0,7,5,23,3,98,8,76};
        for (int i : num) 
        {
         hs.add(i);   
        }
        System.out.println(hs.size());
    }   
}
