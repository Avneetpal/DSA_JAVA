import java.util.*;
class sum
{
    // time compexity o(n^2)
    public void ss(int n[][])
    {
        int sum=0;
      
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n[0].length;j++)
            {
                // primary row
                if(i==j)
                {
                    sum=sum+n[i][j];
                }
                // secondary row
                if(i+j==n.length-1)
                {
                    sum=sum+n[i][j];
                }
            }
        }
       
        System.out.println();
        System.out.println("o(n^2)"+sum);
    }
    // time complexity o(n)
    public void s(int n[][])
    {
        int sum=0;
        for(int i=0;i<n.length;i++)
        {
            sum=sum+n[i][i];
            // secondary diagonal 
            
            if(i!=n.length-1-i)
            {
                sum=sum+n[i][n.length-1-i];// from primary i+j=n.length-1, so j=n.lenght-1-i
            }

        }
        System.out.println(" o(n)"+sum);

    }
}
public class sum_of_diagomnal_elements_of_matrix 
{
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
        sum s=new sum();
        s.s(arr);
        s.ss(arr);
        a.close();
    }
    
}
