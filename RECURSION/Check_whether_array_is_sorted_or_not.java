import java.util.*;
class sorted 
{
    public  boolean  check(int n[],int i)
    {
        if(i==n.length-1)
        {
            return true;
        }
        if(n[i]>n[i+1])
        {
            return false;
        }
        return check(n, i+1);
        
        
    }
}

public class Check_whether_array_is_sorted_or_not 
{
    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
        int[] n=new int[5];
        for(int i=0;i<n.length;i++)
        {
            n[i]=a.nextInt();

        }
        //System.out.println("enter starting position");
       // int st=a.nextInt();
        sorted s=new sorted();
        System.out.println(""+s.check(n, 0));
        a.close();

    }
    
}
