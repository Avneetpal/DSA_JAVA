import java.util.*;
class binary
{
    //public int a[]=new int[];
    public void sort(int a[])
    {
       
        int i=0;
        int temp=0;
        for(i=0;i<=a.length-1;i++)
        {
            for(int j=i+1;j<a.length-i;j++)
            {
                 if(a[i]>a[j])
                 {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                    

                 }
            }
            for(int k=0;k<a.length;k++)
            {
                System.out.println(""+a[k]);
            }
        }
        

    }
  
    public int bin(int n[],int k)
    {
        int start=0;
        int end=n.length-1;
        int mid=start+(end-start)/2;
        while(start<=end)
        {
            if(n[mid]==k)
            return mid;
            else if(n[mid]>k)
            {
                mid =mid-1;
            }
            else
            mid=mid+1;


        }
        return -1;
    }
}
class binary_search
{
    public static void main(String[] args) {
        int number[]=new int[5];
        Scanner a =new Scanner(System.in);
        int i=0;
        for(i=0;i<number.length;i++)
        {
            number[i]=a.nextInt();

        }
        System.out.println("enter no to find");
        int find=a.nextInt();
       a.close();
        binary b=new binary();
        b.sort(number);
        int n=b.bin(number, find);
        if(n==-1)
        {
            System.out.println("element not found");
        }
        else
        System.out.println("element found at index "+n);
       
        
    }
}