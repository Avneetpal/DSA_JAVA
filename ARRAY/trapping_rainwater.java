import java.util.*;
class trapping
{
    public void trap(int height[],int width)
    {
        // calculate left max
        int[] leftmax=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            leftmax[i]=Math.max(height[i],leftmax[i-1]);

        }
        // calculate right max
        int[] rightmax=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater=0;
        // loop
        for(int i=0;i<height.length;i++)
        {
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-height[i];
        }
        //trapped water
        //System.out.println(""+trappedwater);
       int volume=trappedwater*width;
       System.out.println(""+volume);

    }
}
class trapped
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=a.nextInt();
        System.out.println("enter elements of array");
        int[] h=new int[n];
        for(int i=0;i<h.length;i++)
        {
            h[i]=a.nextInt();
        }
        System.out.println("enter width");
        int w=a.nextInt();
        trapping t=new trapping();
        t.trap(h, w);
        a.close();


    }
}