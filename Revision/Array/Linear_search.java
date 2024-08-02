import java.util.*;
class search
{
    public int linear(int e[], int k)
    {
        for(int i=0;i<=e.length-1;i++)
        {
            if(e[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
}
class MAIN
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        for(int i=0;i<num.length;i++)
        {
         num[i]=sc.nextInt();   
        }
        int k=sc.nextInt();
        search ss=new search();
       System.out.println( ss.linear(num, k));
        sc.close();
    

    }
}