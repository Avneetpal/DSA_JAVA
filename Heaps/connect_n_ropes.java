import java.util.*;
class rope
{
    public static void main(String[] args) 
    {
        int rope[]={4,3,2,6};
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<rope.length;i++)
        {
            p.add(rope[i]);
        }
        int cost=0;
       while (p.size()>1) 
       {
            int min=p.remove();
            int min1=p.remove();
            cost+=min+min1;
            p.add(min+min1);
        
       }
       System.out.println(cost);
    
    }
}