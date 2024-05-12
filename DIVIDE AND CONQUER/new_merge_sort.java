import java.util.*;
class mergsort 
{
    public void printaarr(int n[])
    {
        for(int i=0;i<n.length;i++)
        {
            System.out.println(""+n[i]);
        }
    }
    public void merge(int arr[],int start, int end)
    {
        if(start<=end)
        {
            
        
        int mid=start+(end-start)/2;
        merge(arr, start, mid);
        merge(arr, mid+1, end);
        merg(arr, start, end, mid);
       // printaarr(arr); 
        }       

    }
    public void merg(int arr[], int start, int end, int mid)
    {
        int[] temp= new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=end)
        {
            if(arr[i]>arr[j])
            {
                temp[k]=arr[j];
                j++;

            }
            else
            {
                temp[k]=arr[i];
                i++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while (j<=end) 
        {
            temp[k++]=arr[j++];
        }
        for(k=0,i=start;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }
}
public class new_merge_sort {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=a.nextInt();
        int[] num =new int[n];
        for(int i=0;i<num.length;i++)
        {
            num[i]=a.nextInt();
        }
        mergsort m=new mergsort();
        m.merge(num,0,num.length-1);
        m.printaarr(num);
        a.close();

    }

    
}
