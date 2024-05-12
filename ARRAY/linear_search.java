import java.util.*;
class fun
{
    public  int linear(int e[],int k)
    {
        for(int i=0;i<=e.length-1;i++)
        {
            if(e[i]==k)
            return i;

        }
        return -1;

    }
}
class sol
{
    
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num[]=new int[10];
        int i=0;
        System.out.println("enter no in array");
        for(i=0;i<num.length;i++)
        {
            num[i]=a.nextInt();
        }
        System.out.println("enter no to find");
        int g=a.nextInt();
        a.close();
        fun f=new fun();
       int index= f.linear(num, g);
       if(index==-1)
       
        System.out.println("element not  found");
       
       else 
       System.out.println( g+"  found at "+index);
       a.close();
       



    }
}