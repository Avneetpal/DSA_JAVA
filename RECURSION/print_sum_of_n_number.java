import java.util.*;
class sum 
{
    public static int su(int n)
    {
        if(n==1)
        {
            return 1;
        }
        @SuppressWarnings("unused")
        int sumn=su(n-1);
        int s=n+su(n-1);
        return s;
       
        
    }
}



public class print_sum_of_n_number {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        // used to remove static mathod error
        int result=sum.su(n);
        System.out.println(""+result);
        a.close();
        // sum s= new sum();
        // System.out.println(""+s.su(n));
        // a.close();
    }
    
}
