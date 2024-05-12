import java.util.*;
class rot 
{
    public static int sortt(int arr[],int key,int start,int end)
    {
        
        if(start>end)
        {
            return-1;
        }
        int mid=start+(end-start)/2;
        if(key==arr[mid])
            {
        
              return mid;
            }       
        if(arr[start]<=arr[mid])
        {
            if(arr[start]<=key&&key<=arr[mid])
                {
                    return sortt(arr, key, start, mid-1);
                 }
            else
                {
                    return sortt(arr, key, mid+1,end);
                }
        }
        if(arr[mid]<=arr[end])
        {
            if(arr[mid]<=key&&key<=arr[end])
                {
                    return sortt(arr, key, mid+1, end);
                }
            else
                {
                    return sortt(arr, key, start, mid-1);
                }
        }
        
        
            return mid;
    }
}
public class rotated_array_search {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int[] arr=new int[7];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=a.nextInt();
        }
        System.out.println("ENTER KEY");
        int key=a.nextInt();
        int index=rot.sortt(arr, key, 0, arr.length-1);
        System.out.println(""+index);
        a.close();
    }
}
