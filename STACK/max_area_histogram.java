import java.util.*;
class maxarea 
{
    public static void max(int arr[])
    {
        int maxarea=0;
        Stack<Integer> s=new Stack<>();
        int[] smallright=new int[arr.length];
        int[] smallleft=new int[arr.length];
        // step 1 right smaller

        for(int i=arr.length-1;i>=0;i--)
        {
        while (!s.isEmpty()&&s.peek()>=arr[i]) 
        {
            s.pop();
            
        }
        if(s.isEmpty())
        {
            smallright[i]=arr.length;
        }
        else
        {
            smallright[i]=s.peek();
        }
        s.push(i);

    }
    // step 2 small left
    s=new Stack<>();
    for(int j=0;j<arr.length;j++)
    {
        while (!s.isEmpty()&&s.peek()>=arr[j]) 
        {
            s.pop();
            
        }
        if(s.isEmpty())
        {
            smallleft[j]=-1;
        }
        else
        {
            smallleft[j]=s.peek();
        }
        s.push(j);
    }
    // step 3 find area
    for(int i=0;i<arr.length;i++)
    {
        int height=arr[i];
        int width=smallright[i]-smallleft[i]-1;
        int area=height*width;
        maxarea=Math.max(maxarea, area);
    }
    System.out.println("maximu area ="+maxarea);

}
}
public class max_area_histogram 
{
    public static void main(String[] args) {
        Scanner sy=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sy.nextInt();
        System.out.println("enter values in array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sy.nextInt();
        }
        maxarea.max(arr);
        sy.close();
    }

    
}
