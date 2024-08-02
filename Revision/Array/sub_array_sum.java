class sube 
{
    public void sum(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            int start =i;
            for (int j=i;j<arr.length;j++)
            {
                int end=j;
                int sum=0;
                for(int k=start;k<=end ;k++)
                {
                     sum=sum+arr[k];
                }
                System.out.println(sum);
            }
        }
    }
}


public class sub_array_sum {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        sube s=new sube();
        s.sum(arr);
    }  
}
