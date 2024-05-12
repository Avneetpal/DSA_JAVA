// important question do it again 

import java.util.*;
class tiling 
{
    public static int tile(int n)
    {
        // base case
        if(n==0 || n==1)
        {
            return 1;
        }
        // vertical tile
        int vertical=tile(n-1);
        int horizontal=tile(n-2);
        return vertical+horizontal;
    }
}
public class tiling_problem {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        int n=a.nextInt();
        int ans=tiling.tile(n);
        System.out.println(""+ans);
        a.close();
        // tiling t=new tiling();
        // System.out.println(""+t.tile(n));
        
    
    }
    
}
