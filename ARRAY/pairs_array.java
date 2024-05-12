import java.util.*;
class pairs_array
{
    public void pair(int n[])
    {
        int i=0;
        int j=0;
        for(i=0;i<n.length;i++)
        {
            int curr=n[i];
            for(j=i+1;j<n.length;j++)
            {
                System.out.print("("+curr+","+n[j]+")");
            }
            System.out.println("");
        }

    }
}
class pair
{
    public static void main(String args[]) {
        Scanner a=new Scanner(System.in);
        int[] n =new int[5];
        for(int i=0;i<n.length;i++)
        {
            n[i]=a.nextInt();

        }
        pairs_array p=new pairs_array();
        p.pair(n);
    }
}