

import java.util.*;
class merge 
{
    public void printarray(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(""+a[i]);
        }
    }
    public void mergesort(int arr[],int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int mid=start+(end-start)/2;
        mergesort(arr, start, mid);//left part
        mergesort(arr, mid+1, end);
        merg(arr, start, end, mid);
     //   printarray(arr);

    }
    public void merg(int arr[],int start,int end,int mid)
    {
        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while (i<=mid&&j<=end)
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
        //if some elemnts gets remain in left part
        while (i<=mid) {
            temp[k++]=arr[i++];
            
        }
        // if some elments gets remain in right part
        while(j<=end)
        {
            temp[k++]=arr[j++];
        }
        // copy temp in aray
        for(k=0,i=start;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
       }
}
class merge_sort
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        
        System.out.println("enter size of array");
        int n=a.nextInt();
        System.out.println("enter elements in array");
        int[] num =new int[n];
        for(int i=0;i<num.length;i++)
        {
            num[i]=a.nextInt();
        }
        merge m=new merge();
        m.mergesort(num, 0, num.length);
        m.printarray(num);
        a.close();
    }
}