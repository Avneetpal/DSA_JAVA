import java.util.*;
class last 
{
    public void ith(int n, int i)
    {
        int z=(~0)<<i;
        int r=n&z;
        System.out.println(""+r);
    }

}
public class clear_last_i_bits {
    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int i=a.nextInt();
        last l=new last();
        l.ith(n, i);    
        a.close();
    }
    
}
