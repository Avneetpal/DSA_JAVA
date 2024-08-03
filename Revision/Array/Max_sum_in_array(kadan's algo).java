import java.util.Scanner;

class sum
{
    public void kadan(int num[])
    {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            cs=cs+num[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(ms, cs);
        }        
    
        System.out.println(ms);
    
    }



}
class Max_sum 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();

        }
        sc.close();
        sum ss=new sum();
        ss.kadan(num);
    }
    
}
