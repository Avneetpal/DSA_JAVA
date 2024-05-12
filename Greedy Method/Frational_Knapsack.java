import java.util.*;
class knapsack 
{
    public static void Fractional(int value[],int weight[],int w)
    {
         double[][] ratio=new double[value.length][2];
         // column 0=index, column 1=ratio
         for(int i=0;i<value.length;i++)
         {
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
         }
         int capacity=w;
         int total=0;
         // Assending order
         Arrays.sort( ratio,Comparator.comparingDouble(o->o[1]));
         for(int i=ratio.length-1;i>=0;i--)
         {
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx])
            {
                total=total+value[idx];
                capacity=capacity-weight[idx];
            }
            else
            {
                total+=(capacity*ratio[i][1]);
                capacity=0;
            }
         }
         System.out.println(""+total);

    }
   
}
class MAIN 
{
    public static void main(String[] args) {
        int [] value={60,100,120};
        int[] weight={10,20,30};
        int w=50;
        knapsack.Fractional(value, weight, w);

    }
}