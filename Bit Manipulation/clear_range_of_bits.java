import java.util.*;
class range 
{
    public void ran(int n, int start,int end)
    {
        int a=(~0)<<(end+1);
        int b=(1<<(start))-1;
        int r=a|b;
        int result=n&r;
        System.out.println(""+result);
    }
}



public class clear_range_of_bits {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter no");
        int n=a.nextInt();
        System.out.println("enter starting");
        int s=a.nextInt();
        System.out.println("enter ending");
        int e=a.nextInt();
        range r=new range();
        r.ran(n, s, e);
        a.close();
        }
    
}
