import java.util.*;
class compres 
{
    public void com(String s)
    {
        StringBuilder sbb=new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            Integer count=1;
            while(i<s.length()-1&&s.charAt(i)==s.charAt(i+1))
            {
                count++;
                i++;
            }
            sbb.append(s.charAt(i));
            if(count>1)
            {
                sbb.append(count);
            }
        }
        System.out.println(""+sbb);

    }
}




public class string_compression {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String s=new String();
        s=a.nextLine();
        compres c=new compres();
        c.com(s);
        a.close();
    }
}
