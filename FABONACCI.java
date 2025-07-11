import java.util.*;
class calculte
{
    public static int  fab(int n, int f[])// time compleixity O(n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        if(f[n]!=0)
        {
            return f[n];
        }
        f[n]=fab(n-1, f)+fab(n-2, f);
        return f[n];
    }
}
public class FABONACCI {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] f=new int[n+1];// empty array
        System.out.println(calculte.fab(n, f));
        sc.close();
    }
}