import java.util.*;
class intersection_union 
{
    public static void unionandintersection(int arr1[], int arr2[])
    {
            HashSet<Integer> hs=new HashSet<>();
            // union
            for(int i=0;i<arr1.length;i++)
            {
                hs.add(arr1[i]);
            }
            for(int i=0;i<arr2.length;i++)
            {
                hs.add(arr2[i]);
            }
            System.out.println("union  "+hs.size());

            // intersection
            hs.clear();
            int count=0;
            for(int i=0;i<arr1.length;i++)
            {
                hs.add(arr1[i]);

            }
            for(int i=0;i<arr2.length;i++)
            {
                if(hs.contains(arr2[i]))
                {
                    count++;
                    hs.remove(arr2[i]);
                }
            }
            System.out.println("Intersection  "+count);
    }
}
public class intersection_of_two_arrays {
    public static void main(String[] args) {
        int arr1[]={4,2,3,1,7};
        int arr2[]={2,3,8,6,10};
        intersection_union.unionandintersection(arr1, arr2);
        

    }
    
}
