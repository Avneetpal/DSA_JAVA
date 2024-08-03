class selection
{
    public void select(int num[])
    {
        int n=num.length;
        for(int i=0;i<n;i++)
        {
            int minpos=i;
            for(int j=i+1;j<n;j++)
            {
                if(num[j]<num[minpos])
                {
                    minpos=j;
                }
            }
            int temp=num[i];
            num[i]=num[minpos];
            num[minpos]=temp;
        }
        for(int  i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
    }

}
public class selection_sort 
{
    public static void main(String[] args) {
            int[] num={4,3,2,8,7};
            selection s=new selection();
            s.select(num);
    }
    
}
