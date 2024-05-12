// pair sum in rotated and sorted array list

import java.util.ArrayList;
import java.util.Scanner;

class pairsum2 
{
    public static boolean sum(ArrayList<Integer> list, int tar)
    {
        int bp=-1;
        int rp;
        int lp;
        int n=list.size();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>list.get(i+1))
            {
               bp=i;
               break;

            }
        }
        rp=bp;
        lp=bp+1;
        while(lp!=rp)
        {
            if(list.get(lp)+list.get(rp)==tar)
            {
                System.out.println(""+list.get(lp)+","+list.get(rp));
            }
            if(list.get(lp)+list.get(rp)<tar)
            {
                lp=(lp-1)%n;

            }
            else
            {
                
                rp=(n-rp+1)%n;
            }

        }
        return false;
    }
}
public class pair_sum2 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            int j=a.nextInt();
            list.add(j);
        }
        System.out.println("enter target");
        int tar=a.nextInt();
        System.out.println(""+pairsum2.sum(list, tar));
        a.close();

    }
    
}
