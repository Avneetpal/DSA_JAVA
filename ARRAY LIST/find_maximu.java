import java.util.*;
class max 
{
    public static  void ma(ArrayList<Integer> list)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(max<list.get(i))
            {
                max=list.get(i);

            }
        }
        System.out.println("maximum   "+max);

    }
}



public class find_maximu {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            int n=a.nextInt();
            list1.add(n);
        }
        max.ma(list1);
        a.close();
    }
    
}
