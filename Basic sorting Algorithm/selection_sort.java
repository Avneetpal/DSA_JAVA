import java.util.*;
class selection 
{
    public void select(int n[])
    {
        for(int i=0;i<n.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n.length;j++)
            {
                if(n[min]>n[j])
                {
                    min=j;
                }

            }
            int temp=n[min];
            n[min]=n[i];
            n[i]=temp;
            
        }
        
        System.out.println();
        for(int i=0;i<n.length;i++)
        {
            System.out.println(""+n[i]);
        }
    }
}


public class selection_sort {
    public static void main(String args[]) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int[] c= new int[n];
        for(int i=0;i<c.length;i++)
        {
            c[i]=a.nextInt();
        }
        selection ss=new selection();
        ss.select(c);
        a.close();



    }
    
}
