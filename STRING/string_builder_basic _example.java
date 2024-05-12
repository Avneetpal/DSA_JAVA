import java.util.*;
class builder
{
    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
        System.out.println("enter string");
         String sb=a.next();
         StringBuilder str=new StringBuilder(sb);
         for(char ch='a';ch<='z';ch++)
         {
            str.append(ch);
         }
         System.out.println(" "+str );
         a.close();
        

    }
}
