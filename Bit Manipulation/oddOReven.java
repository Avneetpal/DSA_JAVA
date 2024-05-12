import java.util.*;
public class oddOReven {
    public static void main(String[] args) 
    {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int z=n&1;
        if(z==0)
        {
            System.out.println("even");
        }
        else 
        System.out.println("odd");
        a.close();

        
    }
    
}
