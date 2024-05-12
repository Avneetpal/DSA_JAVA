import java.util.*;
class stock 
{
    public static void span(int stock[],int span[])
    {
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(stock[0]);
        for(int i=1;i<stock.length;i++)
        {
            int currprice=stock[i];
            while (!s.isEmpty()&& currprice>stock[s.peek()]) 
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
public class Stock_span_problem  
{
    public static void main(String[] args) {
        int[] stoc=new int[7];
        Scanner a=new Scanner(System.in);
        for(int i=0;i<stoc.length;i++)
        {
            stoc[i]=a.nextInt();
            
        }
        int[] span=new int[stoc.length];
        stock.span(stoc, span);
        for(int i=0;i<span.length;i++)
        {
            System.out.println(""+span[i]);
            i++;
        }
        a.close();
    }

    
}
