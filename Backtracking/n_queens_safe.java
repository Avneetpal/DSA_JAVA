import java.util.*;
class queen
{
    public static void print(char borad[][])
    {
        System.out.println("--------------chess board----------");
        for(int i=0;i<borad.length;i++)
        {
            for(int j=0;j<borad.length;j++)
            {
                System.out.print(" "+borad[i][j]);
            }
            System.out.println();
        }
    }
    public static void quee(char board[][], int row)
    {
        if(row==board.length)
        {
            print(board);
            return ;

        }
        for(int i=0;i<board.length;i++)
        {
            if(issafe(board, row, i))
            {
                board[row][i]='Q';
                quee(board, row+1);
                board[row][i]='x';
            }
            
        }

    }
    public static boolean issafe(char b[][], int r , int c)
    {
        // vertical upward 
        for(int i=r-1;i>=0;i--)
        {
            if(b[i][c]=='Q')
            {
                return false;
            }
        }
        // diagonal left
        for(int i=r-1,  j=c-1;i>=0 &&j>=0;i--,j--)
        {
            if(b[i][j]=='Q')
            {
                return false;
            }

        }
        // diagonal right
        for(int i=r-1,j=c+1; i>=0 && j<b.length;i--,j++)
        {
            if(b[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    
    }
}
class n_queen_safe 
{
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
    
        queen.quee(board,0);
        a.close();
    }
}