// count no of  set bits(no of 1 ) in a no.
import java.util.*;
class bits
{
    public void bitss(int n)
    {
        int count=0;
        while(n!=0)
        {
            
            if((n & 1)!=0)
            {
                count++;
            }
            n=n>>1;

        }
        System.out.println(""+count);
    }
}
public class count_sets_bits_in_no {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        bits b=new bits();
        b.bitss(n);
        a.close();
        

    }
    
}
