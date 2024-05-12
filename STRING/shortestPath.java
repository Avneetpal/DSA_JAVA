import java.util.*;
class shorte 
{
    public float  sho(String s)
    {
        int x=0;
        int y=0;
        for( int i=0;i<s.length()-1;i++)
        {
            //east
            if(s.charAt(i)=='E')
            {
                x=x+1;
            }
            //west
            else if(s.charAt(i)=='W')
            {
                x=x-1;
            }
            //south
            else if(s.charAt(i)=='S')
            {
                y=y-1;
            }
            // north
            else if(s.charAt(i)=='N')
            {
                y=y+1;
            }
        }
        // x square and y square
        float x2=x*x;
        float y2=y*y;
        //int distance=(int)Math.sqrt(y2 + x2);
       return (float)Math.sqrt(x2+y2);
    }

}

public class shortestPath {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String s=new String();
        s=a.next();
        shorte ss=new shorte();
        float f=ss.sho(s);
        System.out.println(""+f);
        a.close();
        

    }
    
}
