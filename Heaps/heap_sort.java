class SORT
{
    public static void heapif(int arr[], int size, int idx)
    {
        int left=2*idx+1;
        int right=2*idx+2;
        int maxidx=idx;
        if(left<size && arr[left]>arr[maxidx])
        {
            maxidx=left;
        }
        if(right<size && arr[right]>arr[maxidx])
        {
            maxidx=right;
        }
        if(maxidx!=idx)
        {
            int temp=arr[idx];
            arr[idx]=arr[maxidx];
            arr[maxidx]=temp;
            heapif(arr, size, maxidx);
        }

    }
    public static void sort(int arr[])
    {
        int n=arr.length;
        // step 1 max heap
        for(int i=n/2;i>=0;i--)
        {
            heapif(arr, n, i);
        }
        // step 2 swap first and last
        for(int i=n-1;i>0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapif(arr, i, 0);

        }

    } 
}

public class heap_sort 
{
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        SORT.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
