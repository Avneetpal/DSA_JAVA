import java.util.*;
class Chocola 
{
    public void chocola_prob(Integer horizonta[], Integer vertical[])
    {
        Arrays.sort(horizonta,Collections.reverseOrder());
        Arrays.sort(vertical,Collections.reverseOrder());
        int hp=1;
        int vp=1;
        int h=0;
        int v=0;
        int cost=0;
        while (h<horizonta.length && v<vertical.length) 
        {
            if(vertical[v]<=horizonta[h])
            {
                cost+=(horizonta[h]*vp);
                h++;
                hp++;
            }
            else
            {
                cost+=(vertical[v]*hp);
                v++;
                vp++;
            }
            
        }
        while (h<horizonta.length) 
        {
            cost+=(horizonta[h]*vp);
            h++;
            hp++;
            
        }
        while (v<vertical.length) 
        {
            cost+=(vertical[v]*hp);
            v++;
            vp++;   
        }
        System.out.println(" "+cost);

    }
}

public class chocola_problem {
    public static void main(String[] args) {
        Integer vertic[]={2,1,3,1,4};
        Integer horizonta[]={4,1,2};
        Chocola c=new Chocola();
        c.chocola_prob(horizonta, vertic);

        
    }
    
}
