import java.util.*;
class sube
{
    public void s(int n[])
    {
        int currentsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++)
        {
            int start=i;
            for(int j=i;j<n.length;j++)
            {
                int end=j;
                currentsum=0;
                for(int k=start;k<=end;k++)
                {
                   currentsum +=n[k];
                }
                 System.out.println(""+currentsum);
                 if(max<currentsum)
                 {
                    max=currentsum;
                 }
            }
            System.out.println();
            
           
        }
         System.out.println("max sum is  "+max);
       
    }
}

class sub_arraye {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int[] n=new int[5];
        for(int i=0;i<n.length;i++)
        {
            n[i]=a.nextInt();
        }
        sube s=new sube();
        s.s(n);
    }
    
}
