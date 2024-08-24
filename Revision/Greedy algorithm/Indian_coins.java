import java.util.*;
class coin 
{
    public  static void india_coin(int coins[],int value)
    {       
        // sorting is done in ascending order
        Arrays.sort(coins);
        int mincoin=0;
        for(int i=coins.length-1;i>=0;i--)
        {
            if(coins[i]<=value)
            {
                while (value>=coins[i]) 
                {
                    mincoin++;
                    value=value-coins[i];
                    
                }
                

            }
            }
            System.out.println( ""+mincoin);
    }
}
class indian_coin
{
    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,500,2000};
        int value=121;
        coin.india_coin(coins,value);
    }
}