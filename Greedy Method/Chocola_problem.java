import java.util.*;
class chocola 
{
    // we used integer because it will be helpful in sorting
    public static void problem(Integer horcost[],Integer vercost[],int n,int m)
    {
        // Collection.reverse order is used so that sorting can be done in descending order
        Arrays.sort(horcost,Collections.reverseOrder());
        Arrays.sort(vercost,Collections.reverseOrder());
        int hp=1,vp=1;
        int h=0,v=0;
        int cost=0;
        while (h<horcost.length && v<vercost.length) 
        {
            if(vercost[v]<=horcost[h])
            { 
                // horizontal cut
                cost+=(horcost[h]*vp);
                h++;
                hp++;
            }
            else{
                // vertical cut 
                cost+=(vercost[v]*hp);
                vp++;
                v++;
            }
            
        }
        while (h<horcost.length) 
        {
            cost+=(horcost[h]*vp);
            h++;
            hp++;
            
        }
        while (v<vercost.length) 
        {
            cost+=(vercost[v]*hp);
            v++;
            vp++;
            
        }
        System.out.println("total min cost "+cost);

    }
}

public class Chocola_problem {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer horcost[]={4,1,2};
        Integer vercost[]={2,1,3,1,4};
        chocola.problem(horcost,vercost , n, m);
    }
}
