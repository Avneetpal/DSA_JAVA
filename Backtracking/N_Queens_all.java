import java.util.*;
// find all places where queens can pe placed either they attack or not
class queen
{
    public static void quee(char board[][],int row)
    {
        // base case
        if(row==board.length)
        {
            printboard(board);
            return;
        }
        for(int i=0;i<board.length;i++)
        {
            board[row][i]='Q';
            quee(board, row+1);//recursion 
            board[row][i]='x';//backtracking
        }
    }
    public static void printboard(char n[][])
    {
        System.out.println("__________chess board_______");
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n.length;j++)
            {
                System.out.print(" "+n[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("_______chess board_______");
    }
}


public class N_Queens_all 
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
        queen.quee(board, 0);
        a.close();
    }
    
}
