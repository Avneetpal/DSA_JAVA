class qsort 
{
    public void quick(int arr[], int start, int end)
    {
        if(start>=end)
        {
            return;
        }
        int pi=partion(arr,start,end);
        quick(arr, start, pi-1);// left part
        quick(arr, pi+1, end);// right part


    }
    public int partion(int arr[],int start,int end)
    {
        int pivot=arr[end];
        int i=start-1;// to make palce for elemnt smaller then pivot
        int temp=0;
        for(int j=start;j<end;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;// making place
                // now swaping
                 temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
          
        }
          // change pivot position
          i++;
          temp=pivot;
          arr[end]=arr[i];
          arr[i]=temp;
          return i;


    }
}
public class quick_sort {
    public static void main(String[] args) {
        int num[]={3,4,1,2,7,5};
        qsort q=new qsort();
        q.quick(num, 0, num.length-1);
        for(int i=0;i<num.length;i++)
        {
            System.out.print(" "+num[i]);
        }
    }
    
}
