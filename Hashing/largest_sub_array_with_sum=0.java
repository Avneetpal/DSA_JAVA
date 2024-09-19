import java.util.*;
class largest_sub 
{   
    public static void main(String[] args) 
    {
     
        int arr[]={15,-2,2,-8,1,7,10,23};
        HashMap<Integer, Integer> hn=new HashMap<>();
        int sum=0;
        int len=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(hn.containsKey(sum))
            {
                len=Math.max(len, i-hn.get(sum));
            }
            else
            {
                hn.put(sum, i);
            }
        }
        System.out.println("largesat sub array ===>" + len);
    }
}
