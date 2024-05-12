// printing nth number of fibonacci series
import java.util.*;
class series 
{
    public static int fibonacci(int n)
    {
        if(n==0|| n==1)
        {
            return n;
        }
        // used when we declare variable and not use it ,then it is used to remove warnning. 
        @SuppressWarnings("unused")
        int fn1=fibonacci(n-1);
        @SuppressWarnings("unused")
        int fn2=fibonacci(n-2);
        int fn=fibonacci(n-1)+fibonacci(n-2);
        return fn;

    }
}

public class fibonacci {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num=a.nextInt();
        int r=series.fibonacci(num);
        System.out.println(""+r);
        a.close();
        // series s= new series();
        // System.out.println(""+s.fibonacci(num));
    }
    
}
