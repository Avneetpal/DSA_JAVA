import java.util.Scanner;
class safee
{
    public static boolean issafe(char board[][],int row,int col)
    {
        //vertical upward
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }

        }
        // diagonal left
        for(int i=row-1, j=col-1;i>=0 &&j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }

        }
        // diagonal right
        for(int i=row-1,j=col+1;i>=0 &&j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }

        }
        return true;

    }
    public static void que(char board[][],int row)
    {
        if(row==board.length)
        {
            // no  of ways
            count++;
            printboardd(board);
            System.out.println();
            return;

        }
        for(int j=0;j<board.length;j++)
        {
            if(issafe(board,row,j))
            {
                board[row][j]='Q';
                que(board, row+1);
                board[row][j]='x';
            }
        }
    }
    public static void printboardd(char board[][])
    {
        System.out.println("--------------chess board----------");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(""+board[i][j]+"");

            }
            System.out.println();
        }
    }
    // to count no of ways 
    static int count=0;
}




public class N_queens_safest_ways {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter no of rows");
        int row=a.nextInt();
        System.out.println("enter no of col");
        int col=a.nextInt();
        char[][] board=new char[row][col];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                board[i][j]='x';
            }
        }
        safee.que(board, 0);
        System.out.println("no of ways"+safee.count);
        a.close();


    }
    
}
