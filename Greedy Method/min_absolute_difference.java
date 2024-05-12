import java.util.*;
class absolute_difference 
{
    public static void Difference(int A[], int B[])
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int total=0;
        for(int i=0;i<A.length;i++)
        {
            total+=Math.abs(A[i]-B[i]);

        }
        System.out.println("Minimum absolute difference "+ total);
    }
}
public class min_absolute_difference {
    public static void main(String[] args) {
        int a[]={1,2,5,4,3};
        int b[]={3,2,7,5,6};
        absolute_difference.Difference(a, b);
    }
    
}
