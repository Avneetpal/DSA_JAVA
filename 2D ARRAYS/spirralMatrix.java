import java.util.*;
class spiral 
{
    public void spir(int n[][])
    {
        int startrow=0;
        int startcol=0;
        int endrow=n.length-1;
        int endcol=n[0].length-1;
        while(startrow<=endrow && startcol<=endcol)
        {
            //top
            for(int j=startcol;j<=endcol;j++)
            {
                System.out.println(""+n[startrow][j]);
            }
            // right
            for(int i=startrow+1;i<=endrow;i++)
            {
                System.out.println(""+n[i][endcol]);
            }
            // bottom
            for(int j=endcol-1;j>=startrow;j--)
            {
                System.out.println(""+n[endrow][j]);
            }
            // left
            for(int i=endrow-1;i>=endcol+1;i--)
            {
                System.out.println(""+n[i][startcol]);
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        } 
        
    

    }
}
public class spirralMatrix {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter no of rows");
        int r=a.nextInt();
        System.out.println("enter no of columns");
        int c=a.nextInt();
        //System.out.println();
        int [][] arr=new int[r][c];
        System.out.println("enter elements in   array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=a.nextInt();
                
            }

        }
        spiral s=new spiral();
        s.spir(arr);
        a.close();

        
    }
    
}
