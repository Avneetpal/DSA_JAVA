import java.util.*;
class fast 
{
    public void expo(int a,int n)
    {
        int ans=1;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans=ans*a;

            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(""+ans);
    }
}

public class fast_exponential 
{
    public static void main(String[] args) {
        
    
    Scanner a=new Scanner(System.in);
    int num=a.nextInt();
    int e=a.nextInt();
    fast f=new fast();
    f.expo(num,e);
    a.close();
}

    
}
