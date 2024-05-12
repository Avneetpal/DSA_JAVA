import java.util.*;
class coinn
{
    public static void indian(int value,int coin[])
    {
        // sorting is done in ascending order
        Arrays.sort(coin);
        int count=0;
        for(int i=coin.length-1;i>=0;i--)
        {
            if(value>=coin[i])
            {
                while (value>=coin[i]) 
                {
                    count++;
                    value=value-coin[i];
                    
                }
            }
        }
        System.out.println(count);
    }

}

public class Indian_coin {
    public static void main(String[] args) {
        int co[]={1,2,5,10,20,50,100,500,2000};
        Scanner sy=new Scanner(System.in);
        System.out.println("enter value");
        int value=sy.nextInt();
        coinn.indian(value, co);
        sy.close();
    }
    
}
