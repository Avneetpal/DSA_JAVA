import java.util.*;
class rotated 
{
    public static int rotate(int arr[], int key,int start,int end)
    {
        start=arr[0];
        end=arr[arr.length-1];
        int mid=start+(end-start)/2;
        if(start>end)
        {
            return -1;
        }
        if(key==arr[mid])
        {
            return mid;       
        }
        if(arr[start]<=arr[mid])
        {
           
            if(arr[start]<=key&&key<=arr[mid])
            {
                return rotate(arr, key, start, mid-1);
            }
            else
            {
                return rotate(arr, key, mid+1, end);
            }
        }
        if(arr[mid]<=arr[end])
        {
            if(arr[end]>=key&&arr[mid]<=key)
            {
                return rotate(arr, key, mid+1, end);
            }
            else
            {
                return rotate(arr, key, start, mid-1);
            }
           

        }
       return mid;
       
}
}
class rotaedsorted
{
public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    int [] arr=new int[7];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=a.nextInt();
    }
    System.out.println("enter key to find");
    int key=a.nextInt();
   // rotated r=new rotated();
    int index=rotated.rotate(arr, key, 0, arr.length-1);
    System.out.println(""+index);

}
}


    