// for asecnideing order we have to buil max heap and for descending order we build min heap
class sort 
{
    public   void heapify(int arr[], int i, int size)
    {
        int left=2*i+1;
        int right=2*i+2;
        int max=i;
        if(left<size && arr[left]>arr[max] )
        {
            max=left;
        }
        if(right<size && arr[right]> arr[max])
        {
            max=right;
        }
        if (max!=i) 
        {
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
            heapify(arr, max, size);
            
        }
    }
    public  void heap_sort(int arr[])
    {   // step 1 build max heap
        int n=arr.length;
        for(int i=n/2;i>=0;i--)
        {
            heapify(arr, i, n);
        }
        // step 2 build largest at end
        for(int i=n-1;i>0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, 0, i);
        }
    }
}

public class heap_sort 
{
    public static void main(String[] args) {
        sort s=new sort();
        int arr[]={2,3,4,1,5};
        s.heap_sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
