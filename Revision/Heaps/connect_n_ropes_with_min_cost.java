import java.util.*;
public class connect_n_ropes_with_min_cost {
  public static void main(String[] args) {
    int arr[]={4,2,1,5};
    PriorityQueue<Integer> p=new PriorityQueue<>();
    for(int i=0;i<arr.length;i++)
    {
        p.add(arr[i]);
    }
    int cost=0;
    while (p.size()>1) 
    {
        int min=p.remove();
        int min2=p.remove();
        cost+=min+min2;
        p.add(min+min2);
        
    }
    System.out.println(cost);

  }  
}
