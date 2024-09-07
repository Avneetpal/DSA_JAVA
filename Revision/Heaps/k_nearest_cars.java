import java.util.*;

class nearrest 
{
    public static class point implements Comparable<point>
    {
        int x;
        int y;
        int distsq;
        int i;
        point(int x, int y, int distsq, int i)
        {
            this.x=x;
            this.y=y;
            this.distsq=distsq;
            this.i=i;
        }
        @Override
        public int compareTo( point p2)
        {
            return this.distsq-p2.distsq;
        }
    }
}
public class k_nearest_cars 
{
    public static void main(String[] args) 
    {
        PriorityQueue<nearrest.point> p=new PriorityQueue<>();

        int arr[][]={{3,3},{3,-1},{2,4}};
        int k=2;
        for(int i=0;i<arr.length;i++)
        {
            int distsq=arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1];
            p.add(new nearrest.point (arr[i][0],arr[i][1],distsq,i));
        }
        for(int i=0;i<k;i++)
        {
            System.out.println(p.remove().i);
        }
        
    }
    
}
