import java.util.*;
class count 
{
    public void co(int n[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++)
        {
            largest=Math.max(largest,n[i]);

        }
        int[] count=new int[largest+1];
        for(int i=0;i<n.length;i++)
        {
            count[n[i]]++;

        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                n[j]=i;
                j++;
                count[i]--;
            }

        }
    }
}
public class count_sort 
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int[] c= new int[n];
        for(int i=0;i<c.length;i++)
        {
            c[i]=a.nextInt();
        }
        System.out.println();
        count cc=new count();
        cc.co(c);
        for(int i=0;i<c.length;i++)
        {
            System.out.println(""+c[i]);
        }
        a.close();
    }
}
