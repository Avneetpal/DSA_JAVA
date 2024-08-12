import java.util.*;
class next_greater 
{
    public void next_great(int arr[])
    {
        Stack<Integer> s=new Stack<>();
        int nextgreater[]=new int[arr.length];
        int n=arr.length-1;
        for(int i=n;i>=0;i--)
        {
            int curr=arr[i];
            while (!s.isEmpty() && curr>arr[s.peek()] ) 
            {
             s.pop();   
            }
            if(s.isEmpty())
            {
                nextgreater[i]=-1;
            }
            else
            {
                nextgreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextgreater.length;i++)
        {
            System.out.print(" "+nextgreater[i]);
        }
    }
}

public class next_greater_element {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        next_greater n=new next_greater();
        n.next_great(arr);
    }
    
}
