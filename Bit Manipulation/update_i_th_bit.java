import java.util.*;
class update 
{
    public void up(int n, int i,int a)
    {
        if(a==0)
        {
            // use clear  i th bit operation
            int z=~(1<<i);
            int r=n&z;
            System.out.println(""+r);

        }
        else
        {
            // use set i th bit operation
            int m=1<<i;
            int q=n|m;
            System.out.println(""+q);


        }
    }
        
}
public class update_i_th_bit 
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter no");
        int n=a.nextInt();
        System.out.println("enter i th position");
        int b=a.nextInt();
        System.out.println("enter bit to update");
        int i=a.nextInt();
        update u=new update();
        u.up(n,i,b);
        a.close();

    }
    
}
