class stock 
{
    public void buy(int price[])
    {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<price.length;i++)
        {
            if(buyprice<price[i])
            {
                int profit=price[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }
            else
            {
                buyprice=price[i];
            }
        }
        System.out.println(maxprofit);
    }
}




public class best_time_to_buy_sell_stock {
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        stock s=new stock();
        s.buy(price);
    }
    
}
