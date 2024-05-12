// create a biggest conatiner to collect the max water in the container
// approach 1
import java.util.*;
class big 
{
    public static void biggest(ArrayList<Integer> arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                int height=Math.min(arr.get(i), arr.get(j));
                int width=j-i;
                int bigg=width*height;
                if(max<bigg)
                {
                    max=bigg;
                }

            }
        }
        System.out.println("biggest container"+max);
    }
}
class water
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("enter no if elements");
        int n=a.nextInt();
        for(int i=0;i<n;i++)
        {
            int j=a.nextInt();
            list.add(j);
        }
        big.biggest(list);
        a.close();
    }
}