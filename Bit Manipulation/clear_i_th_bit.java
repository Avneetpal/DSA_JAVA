import java.util.Scanner;

public class clear_i_th_bit {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int i=a.nextInt();
        int z=~(1<<i);
        int r=n&z;
        System.out.println(""+r);
        a.close();
    }
    
}
