import java.util.*;
class sub
{
    public void s(int n[])
    {
        for(int i=0;i<n.length;i++)
        {
            int start=i;
            for(int j=i;j<n.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(n[k]+"");
                }
                 System.out.println();
            }
             System.out.println();
           
        }
       
    }
}

public class sub_array {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int[] n=new int[5];
        for(int i=0;i<n.length;i++)
        {
            n[i]=a.nextInt();
        }
        sub s=new sub();
        s.s(n);
    }
    
}
