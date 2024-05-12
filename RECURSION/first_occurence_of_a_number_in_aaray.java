import java.util.*;
class first 
{
    public static int occur(int n[],int k,int i)
    {
        if(i==n.length)
        {
            System.out.println("not found");
            return -1;
        }
      
        if(n[i]==k)
        {
            //System.out.println(""+i);
            return i;
        }
       
        return occur(n, k,i+1);
    }
}


public class first_occurence_of_a_number_in_aaray {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int[] n=new int[5];
        for(int i=0;i<n.length;i++)
        {
            n[i]=a.nextInt();

        }
        System.out.println("enter key");
        int k=a.nextInt();
        int r=first.occur(n, k, 0);
        System.out.println(""+r);
        a.close();
        // first f=new first();
        // System.out.println(""+f.occur(n, k, 0));
    }
    
}
