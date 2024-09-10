import java.util.*;
class majority 
{
    public static void maj(int arr[])
    {
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            if(hm.containsKey(num))
            {
                hm.put(num, hm.get(num)+1);
            }
            else
            {
                hm.put(num, 1);
            }
        }
        Set<Integer> key=hm.keySet();
        for (int K : key) 
        {
            if(hm.get(K)>=arr.length/3)
            {
                System.out.println(""+K);
            }
            
        }
    }
}

public class majority_element {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,4,6};
        majority.maj(arr);
    }
    
}
