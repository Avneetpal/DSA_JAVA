import java.util.*;
class fun
{
    public void larg(int n[])
    {
        int i=0;
        int a=Integer.MIN_VALUE;
        for(i=0;i<n.length;i++)
        {
            if(a<n[i])
            a=n[i];

        }
        System.out.println("largest no"+a);
    }
}
class Main
{
    public static void main(String args[]) {
        int num[]=new int[10];
        Scanner a = new Scanner(System.in);
        for(int i=0;i<num.length;i++)
        {
            num[i]=a.nextInt();

        }
    
    
        fun f =new fun();
        f.larg(num);
        a.close();

    }
}
