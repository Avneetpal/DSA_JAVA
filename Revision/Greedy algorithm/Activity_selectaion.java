import java.util.*;
class selection
{
    public void select(int start[], int end[])
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int prevend=end[0];
        ans.add(0);
        int count=1;
        for(int i=0;i<start.length;i++)
        {
            if(start[i]>=prevend)
            {
                count++;
                prevend=end[i];
                ans.add(i);
            }
        }
        System.out.println("no of activities"+count);
        System.out.println("selected activities"+ans);

    }
}

class MAIN 
{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        selection s=new selection();
        s.select(start, end);
    }
}