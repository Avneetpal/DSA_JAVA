import java.util.*;
class sub
{
    public void s(String str,int s,int e)
    {
        String substr="";
        for(int i=s;i<e;i++)
        {
            substr+=str.charAt(i);

        }
        System.out.println(""+substr);

    }
}

public class substring {
    public static void main(String[] args) 
    {
        Scanner a= new Scanner(System.in);
        String str=new String();
        System.out.println("enter string");
        str=a.next();
        int start,end;
        System.out.println("enter starting index");
        start=a.nextInt();
        System.out.println("enter ending index");
        end=a.nextInt();
        sub s=new sub();
        s.s(str, start, end);
        a.close();
        
    }
    
}
