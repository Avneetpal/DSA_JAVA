import java.util.*;
class sort_search
{
    public boolean sorte(int n[][], int k)
    {
        int row=0;
        int col=n.length-1;
        while(row<n.length&&col>0)
        {
            if(n[row][col]==k)
            {
                System.out.println("found at index ("+row+","+col+")");
                return true;
               
            }
            
            else if(n[row][col]<k)
            {
                row++;
            }
            else if(n[row][col]>k)
            {
                col--;
            }
        }
        return false;
    }
}



public class search_in_sorted_2Darray {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter no of rows");
        int r=a.nextInt();
        System.out.println("enter no of columns");
        int c=a.nextInt();
        
        int [][] arr=new int[r][c];
        System.out.println("enter elements in   array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=a.nextInt();
                
            }

        }
        System.out.println("enter key to search");
        int k =a.nextInt();
        sort_search s=new sort_search();
        s.sorte(arr, k);
        a.close();
    }
}
