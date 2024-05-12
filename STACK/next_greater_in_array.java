import java.util.*;
class nextGreater 
{
    public static void greater(int arr[])
    {
        Stack<Integer> s=new Stack<>();
        int n=arr.length-1;
        int [] nextgreater=new int[arr.length];
        for(int i=n;i>=0;i--)
        {
            while (!s.isEmpty()&&arr[i]>=arr[s.peek()]) 
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
        System.out.println();
        for(int i=0;i<nextgreater.length;i++)
        {
            System.out.print(" ["+nextgreater[i]+"]");
        }



    }
}


public class next_greater_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[6];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        nextGreater.greater(arr);
        sc.close();
       
    }
    
}
