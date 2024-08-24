import java.util.*;
class minabsoulte 
{
    public void min_absolute(int arr1[],int arr2[])
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum=0;
    
        for(int i=0;i<arr1.length;i++)
        {
            sum+=Math.abs(arr1[i]-arr2[i]);
        }
        System.out.println(""+sum);
    }
}
public class Min_absoulte_error 
{
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={2,1,3};
        minabsoulte m=new minabsoulte();
        m.min_absolute(arr1, arr2);
    }
    
}
