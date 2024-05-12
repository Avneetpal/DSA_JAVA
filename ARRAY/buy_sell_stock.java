import java.util.*;
class stock 
{
    public void st(int price[])
    {
    int buy_price=Integer.MAX_VALUE;
    int profit=0;
    int maxprofit=0;
    for(int i=0;i<price.length;i++)
    {
        if(buy_price<price[i])
        {
            profit=price[i]-buy_price;
             maxprofit=Math.max(maxprofit, profit);
        }
        else
            buy_price=price[i];

    }
    System.out.println("max profit  "+maxprofit);
    }
    
}
public class buy_sell_stock {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=a.nextInt();
        System.out.println("enter data");
        int[] num =new int[n];
        for(int i=0;i<num.length;i++)
        {
            num[i]=a.nextInt();
        }
        stock s=new stock();
        s.st(num);
        a.close();

    }
    
}
