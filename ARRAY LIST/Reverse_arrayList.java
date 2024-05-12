import java.util.*;
class rev 
{
    public static void r(ArrayList<Integer> list)
    {

        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(""+list.get(i));

        }
    }
}


public class Reverse_arrayList {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            int n=a.nextInt();
            list.add(n);
        }
        rev.r(list);
        a.close();

    }
    
}
