// first sort for binary search and then divide array to find the no
import java.util.*;
class binary 
{
    public void  sort(int arr[])
    {
        int i=0;
       
        for(i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public int bin(int arr[], int k)
    {
        int start=0;
        int end=arr.length-1;
        while (start<end) 
        {
            int mid=(start+end)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]>k)
            {
                mid=mid-1;
            }
            else
            {
                mid=mid+1;
            }
            
        }
        return -1;
        
    }
}



public class binary_seacrh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();

        }
        System.out.println("enter no to find");
        int k=sc.nextInt();
        binary b=new binary();
        b.sort(num);
        int n=b.bin(num, k);
        sc.close();
        if(n==-1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("found");
        }
        
    }
    
}
