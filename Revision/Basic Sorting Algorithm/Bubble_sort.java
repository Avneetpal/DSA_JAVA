// bubble sort

class bubble 
{
    public void bubble_sort(int num[])
    {
        int n=num.length;
        for (int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(num[j-1]>num[j])
                {
                int temp=num[j];
                num[j]=num[j-1];
                num[j-1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(num[i]+" ");
        }
    }

}

class MAIN 
{
    public static void main(String[] args) {
        int num[]={4,3,5,2,1};
        bubble b=new bubble();
        b.bubble_sort(num);

       
    }
}