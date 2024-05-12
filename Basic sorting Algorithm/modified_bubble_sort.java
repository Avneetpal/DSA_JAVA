import java.util.*;
class modified 
{
    public void pr(int n[])
    {
        for(int i=0;i<n.length;i++)
        {
            System.out.println(""+n[i]);
        }
    }
    public void sooo(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
           
            boolean b=false;
            
            for(int j=i+1;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    b=true;
                }
            }
            if(b == false)
            break;
        }
        
    }
}
class sorti
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int [] arr=new int[7];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=a.nextInt();
        }
        modified m=new modified();
        m.sooo(arr);
        m.pr(arr);
        a.close();
     }
}