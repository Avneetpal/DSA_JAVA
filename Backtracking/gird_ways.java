//import java.util.*;
class grid 
{
    public  static int g(int startrow,int startcol,int row,int col)
    {
        // base case
        if(startcol==col-1 && startrow==row-1)
        {
            return 1;
        }
        else if(startcol==col || startrow== row)
        {
            return 0;
        }
        int way1=g(startrow+1, startcol, row, col);// for right
        int way2=g(startrow, startcol+1, row, col);// for down
        return way1+way2;
       
    }
}

public class gird_ways {
    public static void main(String[] args) {
        int row=20;
        int col=20;
        
       
       
        System.out.println(""+grid.g(0, 0, row,col));
        
    }
    
}
