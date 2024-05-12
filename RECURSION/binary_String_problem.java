import java.util.*;
class bin 
{
    public void binary (int n, int last,String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        binary(n-1, 0, str+"0");
        if(last==0)
        {
            binary(n-1, 1, str+"1");
        }
    }
}
public class binary_String_problem 
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        bin b=new bin();
        b.binary(n,0,"");
        a.close();
    }
    
}
