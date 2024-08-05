import java.util.*;
class sort 
{
    public boolean find(int num[][],int k)
    {
        int row=0;
        int col=num.length-1;
        while (row<num.length && col>0) 
        {
            if(num[row][col]==k)
            {
                System.out.println("found at index  "+row+" "+col);
                return true;
            }
            if(num[row][col]>k)
            {
                col--;
            }
            if(num[row][col]<k)
            {
                row++;
            }
            
            
        }
        return false;
    }
}

public class search_in_sorted_matrix {
    public static void main(String[] args) {
        int num[][]=  { {10, 20, 30, 40},
                           {15, 25, 35, 45},
                           {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        sort ss=new sort();
        ss.find(num, k);
        sc.close();
        
    }
    
}
