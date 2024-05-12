//import java.util.*;
class sudokk 
{
    public static boolean s(int arr[][],int row,int col)
    {
        if(row==9)
        {
            return true;
        }
        // recursion
        int nextrow=row;
        int nextcol=col+1;
        if(col+1==9)
        {
            nextrow=row+1;
            nextcol=0;

        }
        if(arr[row][col] !=0)
        {
        return s(arr, nextrow, nextcol);

        }
        for(int digit=1;digit<=9;digit++)
        {
            if(isSafe(arr,row,col,digit))
            {
                arr[row][col]=digit;
                if(s(arr, nextrow, nextcol))
                {
                    return true;
                }
                arr[row][col]=0;
            }

        }
        return false;

    }
    public static boolean isSafe(int arr[][],int row, int col,int digit)
    {
        for( int i=0;i<=8;i++)
        {
            if(arr[i][col]==digit)
            {
                return false;
            }
            

        }
        for(int j=0;j<=8;j++)
        {
            if(arr[row][j]==digit)
            {
                return false;
            }
        }
        int sr=row/3;
        int sc=col/3;
        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++)
            {
                if(arr[row][col]==digit)
                {
                    return false;

                }

            }
        }
        return true;
    }
    public static void pr(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}




public class sudoku_solver {

    public static void main(String[] args) {
        // Scanner a=new Scanner(System.in);
        // int [][] arr=new int[9][9];
        // for(int i=0;i<9;i++)
        // {
        //     for(int j=0;j<9;j++)
        //     {
        //         arr[i][j]=a.nextInt();
        //     }
        // }
         int arr[][]={ {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        sudokk.s(arr, 0, 0);
        sudokk.pr(arr);

    }


}
