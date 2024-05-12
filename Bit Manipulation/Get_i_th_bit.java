import java.util.Scanner;

public class Get_i_th_bit {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter no");
        int n=a.nextInt();
        System.out.println("enter i th bit to find");
        int i =a.nextInt();
        int z=n&(1<<i);
        if(z==0)
        {
            System.out.println(" 0 bit");
        }
        else
        System.out.println(" 1 bit ");
        a.close();

    }
    
}
