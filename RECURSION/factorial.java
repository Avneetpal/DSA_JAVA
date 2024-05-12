import java.util.*;
class fact
{
    public int fac(int n)
    {
        if(n==0)
        {
            return 1;
        }
        @SuppressWarnings("unused")
       int fnm=fac(n-1);
       int fn=n*fac(n-1);
       return fn;
    }
}

public class factorial
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num=a.nextInt();
        fact f=new fact();
        System.out.println(""+f.fac(num));
        a.close();
    }
    
}
