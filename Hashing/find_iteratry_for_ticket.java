import java.util.*;
class Ticket 
{
    public static String start(HashMap<String,String> hs)
    {
        HashMap<String,String> revhs=new HashMap<>();
        for (String key : hs.keySet()) 
        {
            revhs.put(hs.get(key), key);
        }
        for (String key : hs.keySet()) 
        {
         
            if(!revhs.containsKey(key))
            {
                return key; // start point
            }
        }
        return null;
    }
}
class Ticket_iteratry 
{@SuppressWarnings("unused")
    public static void main(String[] args) {
        HashMap<String, String> hm=new HashMap<>();
        hm.put("Chennai", "Bamglore"); 
        hm.put("Mumbai", "Delhi"); 
        hm.put("Goa", "Chennai"); 
        hm.put("Delhi", "Goa"); 
        String start=Ticket.start(hm);
        System.out.println(start);
        
        for (String key : hm.keySet()) 
        {
         System.out.print("-->"+hm.get(start));
         start=hm.get(start);   
        }
    }
}