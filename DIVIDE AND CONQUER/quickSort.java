import java.util.*;
class quick 
{
    public void quic(int arr[], int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int pi=partion(arr,start,end);
        quic(arr, start, pi-1);
        quic(arr, pi+1, end);

    }
    public static int partion(int arr[],int start,int end)
    {
        int pivot=arr[end];
        int i=start-1;// to create place for elemnt leess then pivot
        int temp=0;
        for(int j=start;j<end;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        
        }
        i++;
                temp=pivot;
                arr[end]=arr[i];
                arr[i]=temp;
                return i;


    }
    public void printar(int n[])
    {
        for(int i=0;i<n.length;i++)
        {
            System.out.println(""+n[i]);
        }
    }
}






public class quickSort {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=a.nextInt();
        int[] num =new int[n];
        for(int i=0;i<num.length;i++)
        {
            num[i]=a.nextInt();
        }
        quick q=new quick();
        q.quic(num, 0, n-1);
        q.printar(num);
        a.close();
        
    }
    
}
