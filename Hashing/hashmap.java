import java.util.*;
class hashmap
{
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India", 20);
        hm.put("nepal", 14);
        hm.put("aus", 5);
        hm.put("srilanaka", 11);
        hm.put("afg", 8);   
        System.out.println(hm);
        Set<String> key= hm.keySet();
        // type foreach for this
        for (String k : key) 
        {
            System.out.println("key  "+k );
            
        }
    }
}