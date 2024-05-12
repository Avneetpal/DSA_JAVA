// print the biggest string accorduing to the alphebate not size
import java.util.*;
class  biggest
{
    public void big(String s[])
    {
        int n=s.length;
        String bigger=s[0];
        for(int i=0;i<n;i++)
        {
            if(bigger.compareToIgnoreCase(s[i])<0)//ignore case treats capital and small letterse equally
            {

                bigger=s[i];

            }
           
        }
        System.out.println(" biggest is "+bigger);



    }
}


public class printBigger_String {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter no of elemnts");
        int m=a.nextInt();
        String[] s=new String[m];
        for(int i=0;i<s.length;i++)
        {
            s[i]=a.next();
        }
        biggest b=new biggest();
        b.big(s);
        a.close();


    }
    
}
