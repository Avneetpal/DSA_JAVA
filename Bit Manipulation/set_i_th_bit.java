import java.util.Scanner;

public class set_i_th_bit {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter  no");
        int n=a.nextInt();
        System.out.println("enter i th bit to set");
        int i =a.nextInt();
        int z=1<<i;
        int r=n|z;
        System.out.println(""+r);
        a.close();

    }
    
}
