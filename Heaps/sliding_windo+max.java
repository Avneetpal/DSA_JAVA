import java.util.*;
class Sliding 
{
    static class pair implements Comparable<pair>
    {
        int val;
        int idx;
        public pair(int val, int idx)
        {
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(pair p2)
        {
            return p2.val-this.val;
        }
    }
}


 class sliding_windo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,7,8};
        PriorityQueue<Sliding.pair> pq=new PriorityQueue<>();
        int k=3;
        int[] res=new int[arr.length-k+1];
        // 1st window
        for(int i=0;i<k;i++)
        {
            pq.add(new Sliding.pair(arr[i], i));
        }
        res[0]=pq.peek().val;
        for(int i=k;i<arr.length;i++)
        {
            while (pq.size()>0 && pq.peek().idx<=(i-k)) 
            {
                 pq.remove();   
            }
            pq.add(new Sliding.pair(arr[i], i));
            res[i-k+1]=pq.peek().val;
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.println(" "+ res[i]);
        }

    }
    
}
