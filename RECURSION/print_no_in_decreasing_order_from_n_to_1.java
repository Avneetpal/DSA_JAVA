import java.util.*;
class no 
{
    public void decresaing(int n)
    {
        if(n==1)
        {
            System.out.println(""+n);
            return;
        }
        System.out.println(""+n);
        decresaing(n-1);

        
    }
    public void increaing(int start, int end)
    {
        
        if(start==end)
        {
            System.out.println(""+end);
            return;
        }
        System.out.println(""+start);
        increaing(start+1, end);

    }

}
class decreasing 
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int e=a.nextInt();
        no nn=new no();
       // nn.decresaing(n);
       nn.increaing(n, e);
       a.close();
       
    }
}