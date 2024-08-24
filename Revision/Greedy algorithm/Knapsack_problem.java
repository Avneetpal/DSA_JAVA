import java.util.*;
class Knapsack
{
    public void knapsackk(int weight[], int value[],int totalweight)
    {
        double result[][]=new double[value.length][2];
        // col 0=index, col 1=ratio
        for(int i=0;i<value.length;i++)
        {
            result[i][0]=i;
            result[i][1]=value[i]/(double)weight[i];
        } 
        Arrays.sort(result,Comparator.comparingDouble(o -> o[1]));// it is in ascending order
        // we need in descending order
        
        int capacity =totalweight;
        int profit=0;
        for(int i=result.length-1;i>=0;i--)
        {
          
            int idx=(int)result[i][0]; 
            if(capacity>=weight[idx])
            {
                profit+=value[idx];
                capacity-=weight[idx];
                i++;
                
            }
            else
            {
                profit+=(result[i][1]*capacity);
                capacity=0;
            }
            
        }
        System.out.println("total profit"  +profit);
    }
}

public class Knapsack_problem 
{
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int total=50;
        Knapsack k=new Knapsack();
        k.knapsackk(weight, value, total);
    }
    
}
