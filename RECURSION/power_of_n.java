import java.util.*;
class power 
{
    public static int powe(int n,int e)
    {
       //int power =n;
        if(e==0)
        {
            return 1 ;
        }
       int en=powe(n, e-1);
       int power=n*en;
       return power;
    }
}





public class power_of_n {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num=a.nextInt();
        int exp=a.nextInt();
        int r=power.powe(num, exp);
        System.out.println(""+r);
        a.close();
        // power p=new power();
        // System.out.println(""+p.powe(num, exp));
    }
    
}
