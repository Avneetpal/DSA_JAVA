//apporoach 2 pair sum
import java.util.*;
class Approach2 
{
    public static boolean sum2(ArrayList<Integer>list,int target)
    {
        
        int right=list.size()-1;
        int left=0;
        while(left<right)
        {
            if(list.get(left)+list.get(right)==target)
            {
                System.out.println(""+list.get(left)+","+list.get(right));
                return true;
            }
            if(list.get(left)+list.get(right)<target)
            {
                left++;
            }
            else
            right--;

        }
        return false;
    }
}
public class Approach_2_pair_sum {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            int j=a.nextInt();
            list.add(j);
        }
        System.out.println("enter target");
        int tar=a.nextInt();
        System.out.println(""+Approach2.sum2(list, tar));
        a.close();
        
    }
    
}
