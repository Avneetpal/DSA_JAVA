import java.util.*;
class kadan
{
    public void kadansum(int n[])
    {
        int cs=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++)
        {
            cs=cs+n[i];
            if(cs<0)
            {
                cs=0;
            }
            maxsum=Math.max(maxsum, cs);
        }
        System.out.println("max sum is  "+maxsum);

    }
}
class kad
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in); 
        int[] n=new int[5];
        for(int i =0;i<n.length;i++)
        {
            n[i]=a.nextInt();

        }
        kadan k=new kadan();
        k.kadansum(n);
        a.close();
    }
}