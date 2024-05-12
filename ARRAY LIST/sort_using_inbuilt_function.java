import java.util.*;

public class sort_using_inbuilt_function {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner a=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            int n=a.nextInt();
            list.add(n);
        }
        Collections.sort(list);
        System.out.println(""+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(""+list);
        a.close();
    }
    
}
