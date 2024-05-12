import java.util.*;
class Activity 
{
    public void selection(int start[], int end[])
    {
        ArrayList<Integer> ans =new ArrayList<>();// store answer
        int count=1;
        int prevend=end[0];
        ans.add(0);// 0 th index because it will be used first.
        for(int i=1;i<start.length-1;i++)
        {
            if(start[i]>=prevend)
            {
                count++;
                prevend=end[i];
                ans.add(i);
            }
        }
        System.out.println(""+count);
        System.out.println(ans);
    }
}
class Activity_selection 
{
    public static void main(String[] args) {
        int[] start ={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        Activity a=new Activity();
        a.selection(start, end);

    }
}