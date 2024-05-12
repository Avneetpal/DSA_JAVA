import java.util.ArrayList;
import java.util.Scanner;

public class swap_2_no {
    public static void main(String[] args) {
        ArrayList<Integer> list11=new ArrayList<>();
         Scanner a=new Scanner(System.in);
         for(int i=0;i<5;i++)
         {
            int n=a.nextInt();
            list11.add(n);
         }
         int inx=1,indx2=3;
         // swap
         int temp=list11.get(inx);
         list11.set(inx, list11.get(indx2));
         list11.set(indx2,temp);
         System.out.println(""+list11);
         a.close();
    }
    
}
