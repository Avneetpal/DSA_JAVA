import java.util.*;
class array
{
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
        System.out.println("******************************************");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
        a.close();
    }
}