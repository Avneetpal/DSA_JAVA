// aproach 2 biggest container
// 2 pointer approach

import java.util.ArrayList;
import java.util.Scanner;

class Approach_2
{
    public static void big(ArrayList<Integer>arr)
    {
        int left=0;
        int Right=arr.size()-1;
        int max=Integer.MIN_VALUE;
        while (left<Right)
         {
            int height=Math.min(arr.get(Right), arr.get(left));
            int width=Right-left;
            int bigg=height*width;
            if(bigg>max)
            {
                max=bigg;
            }
            if(Right<left)
            {
                Right--;
            }
            else
            left++;
            
        }
        System.out.println(""+max);      
    }
}

public class Approach_2_biggest_conatiner 
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("enter no of elements");
        int n=a.nextInt();
        System.out.println("enter elements in array list");
        for(int i=0;i<n;i++)
        {
            int j=a.nextInt();
            list.add(j);
        }
        Approach_2.big(list);
        a.close();
    }
    
}
