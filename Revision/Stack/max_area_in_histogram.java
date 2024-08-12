import java.util.*;
class area 
{
    public void maxarea(int histo[])
    {
        Stack<Integer> s=new Stack<>();
        int nsl[]=new int[histo.length];// next smaller left
        int nsr[]=new int[histo.length];// next smaller right
        int maxar=0;
        // left smaller
        for(int i=0;i<histo.length;i++)
        {
            while (!s.isEmpty() && histo[s.peek()]>=histo[i]) 
            {
             s.pop();   
            }
            if(s.isEmpty())
            {
               nsl[i]=histo.length; 
            }
            else
            {
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        // right smaller
        s=new Stack<>();
        for(int i=histo.length-1;i>=0;i--)
        {
            while (!s.isEmpty() && histo[s.peek()]>=histo[i]) 
            {
                s.pop();
                
            }
            if(s.isEmpty())
            {
                nsr[i]=histo.length;
            }
            else
            {
                nsr[i]=s.peek();
            }
            s.push(i);

        }
        // max area width=i-j-1 ===> nsl-nsr-1
        for(int i=0;i<histo.length;i++)
        {
            int height=histo[i];
            int width=nsl[i]-nsr[i]-1;
            int currarea=width*height;
             maxar=Math.max(maxar, currarea);
        }
        System.out.println(maxar);

    }
}

class MAIN 
{
    public static void main(String[] args) {
        
        int arr[]={2,1,5,6,2,3};
        area a=new area();
        a.maxarea(arr);
    }
}