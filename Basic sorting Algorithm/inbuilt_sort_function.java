import java.util.*;
public class inbuilt_sort_function 
{
    public static void main(String args[]) 
    {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int[] c= new int[n];
        for(int i=0;i<c.length;i++)
        {
            c[i]=a.nextInt();
        }
        // array sort
        Arrays.sort(c);
        for(int i=0;i<c.length;i++)
        {
            System.out.println(""+c[i]);
        }
        System.out.println();
        // array sort within given index
        Arrays.sort(c,2,4);
         for(int i=0;i<c.length;i++)
        {
            System.out.println(""+c[i]);
        }
        a.close();
    }
}