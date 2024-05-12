import java.util.*;
class chain 
{
    public static void pair(int pair[][])
    {
        Arrays.sort(pair,Comparator.comparing(o->o[1]));
        int chainlenght=1;
        int chainend=pair[0][1];
        for(int i=0;i<pair.length;i++)
        {
            if(pair[i][0]>=chainend)
            {
                chainlenght++;
                chainend=pair[i][1];
            }
        }
        System.out.println("max chain   "+chainlenght);


    }
}

public class Max_chain_pair {
    public static void main(String[] args) {
        int chains[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        chain.pair(chains);
    }    
}
