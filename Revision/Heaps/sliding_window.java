import java.util.*;
class sliding  
{
    static class pair implements Comparable<pair>
    {
        int val;
        int idx;
        pair(int val, int idx)
        {
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(pair p2)
        {
            // for descending order
            return p2.val-this.val;
        }
    }
}
public class sliding_window {
    public static void main(String[] args) {
        int arr[]={1,2,-1,3,5,7};
        int k=3;
        int res[]=new int[arr.length-k+1];
        PriorityQueue<sliding.pair> pq=new PriorityQueue<>();
       for(int i=0;i<k;i++)
       {
        pq.add(new sliding.pair(arr[i], i));
       } 
       res[0]=pq.peek().val;
       for(int i=k;i<arr.length;i++)
       {
        while (pq.size()>0 && pq.peek().idx<=(i-k)) 
        {
            pq.remove();
            
        }
        pq.add(new sliding.pair(arr[i], i));
        res[i-k+1]=pq.peek().val;
       }
       for(int i=0;i<pq.size();i++)
       {
        System.out.println(res[i]);
        
        
       }
    }
    
    
}
