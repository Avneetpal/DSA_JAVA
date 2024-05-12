import java.util.*;
class bubble
{
    public void bubb(int m[])
    {
        int temp=0;
        for(int i=0;i<m.length;i++)
        {
            for(int j=i+1;j<m.length;j++)
            {
                if(m[i]>m[j])
                {
                    temp=m[i];
                    m[i]=m[j];
                    m[j]=temp;
                }
            }
        }
        System.out.println();
        for( int i=0;i<m.length;i++)
        {
            System.out.println(""+m[i]);
        }
    }
}
class bubble_sort
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int[] num=new int[n];
        for( int i=0;i<num.length;i++)
        {
            num[i]=a.nextInt();
        }
        bubble b=new bubble();
        b.bubb(num);
        a.close();

    }
}