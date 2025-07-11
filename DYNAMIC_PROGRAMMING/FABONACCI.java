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
    public static int fib_tab(int n )
    {
        int [] f=new int[n+1];
        f[0]=0;
        f[1]=1;
        
        for(int i=2;i<=n;i++)
        {
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
}
public class FABONACCI {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] f=new int[n+1];// empty array
        System.out.println(calculte.fab(n, f));
        System.out.println(calculte.fib_tab(n));
        sc.close();
    }
}
