import java.util.*;
class pall
{
    public void palindro(String s)
    {
        int i,j;
        for(i=0, j=s.length()-1;i<=j && s.charAt(i)==s.charAt(j);i++,j-- );
        
            if(j<=i)
            
                System.out.println("palindrome");
            
            else 
            System.out.println("not palindorme");

        
    }
}
class palindorme
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String s=new String();
        s=a.next();
        pall p=new pall();
        p.palindro(s);
        a.close();

    }
}
