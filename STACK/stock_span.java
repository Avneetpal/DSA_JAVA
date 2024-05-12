import java.util.*;
class stockk
{
public static void span(int stock[], int span[])
{
    Stack<Integer> s=new Stack<>();
    span[0]=1;
    s.push(0);
    for(int i=1;i<stock.length;i++)
    {
        int curr=stock[i];
        while (!s.isEmpty()&&curr>stock[s.peek()]) 
        {
            s.pop();
            
        }
        if(s.isEmpty())
        {
            span[i]=i+1;
        }
        else 
        {
            int prev=s.peek();
            span[i]=i-prev;
        }
        s.push(i);



    }
}
}
class MIAN 
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int stock[]={90,85,65,70,80,100};
        // int [] stock=new int[6];
        // for(int i=0;i<stock.length;i++)
        // {
        //     stock[i]=a.nextInt();
            
        // }
        int[] span=new int[stock.length];
        stockk.span(stock, span);
        for(int i=0;i<span.length;i++)
        {
            System.out.println(""+span[i]);
            
        }
        a.close();

    }
}