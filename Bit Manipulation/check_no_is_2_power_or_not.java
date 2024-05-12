//check whether no is 2's power or not
import java.util.*;
public class check_no_is_2_power_or_not 
{
    public static void main(String[] args) {
        
    
    Scanner a=new Scanner(System.in);
    int n=a.nextInt();
    int z=n&(n-1);
    if(z==0)
    {
        System.out.println("no is power of 2");
    }
    else 
    {
        System.out.println("no is not power of 2");
    }
    a.close();

}  
}
