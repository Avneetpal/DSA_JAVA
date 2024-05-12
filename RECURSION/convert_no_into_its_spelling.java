import java.util.*;
class spelling 
{
    static String number[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        int digit=n%10;
        
        //int nn=n/10;
        print(n/10);
        System.out.print(number[digit]+" ");
    }
}
public class convert_no_into_its_spelling {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num=a.nextInt();
       spelling.print(num);
       a.close();
    }
    
}
