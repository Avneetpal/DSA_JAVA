class rain 
{
    public void water(int height[], int width)
    {
        // left max
        int[] leftmax=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }

        // right max
        int[] rightmax=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        int trappedwater=0;
        for (int i=0;i<height.length;i++)
        {
            System.out.print(leftmax[i]);
            
        }
        System.out.println();
        for (int i=0;i<height.length;i++)
        {
            System.out.print(rightmax[i]);
            
        }

        for(int i=0;i<height.length;i++)
        {
            int waterlevl=Math.min(rightmax[i],leftmax[i]);
            trappedwater+=waterlevl-height[i];
        }
        int vol=trappedwater*width;
        System.out.println(vol);
    }
}





public class rain_water_problem {
    public static void main(String[] args) {
        int num[]={4,2,0,6,3,2,5};
        rain r=new rain();
        int width=1;
        r.water(num, width);
    }
    
}
