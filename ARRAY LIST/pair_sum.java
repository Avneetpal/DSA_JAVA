// a sorted array is given find the target sum using the elements
// approach 1

import java.util.ArrayList;
import java.util.Scanner;

class summ
{
    public  static boolean sum(ArrayList<Integer>list,int tar)
    {
        //i//nt sum;
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i)+list.get(j)==tar)
                {
                    System.out.println(""+list.get(i)+","+list.get(j));
                    return true;
                }
            }
        }
        
        return false;


    }
}

public class pair_sum {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            int j=a.nextInt();
            list.add(j);
        }
        System.out.println("enter sum target");
        int tar=a.nextInt();
       System.out.println( ""+summ.sum(list, tar));
        a.close();
    }
    
}
