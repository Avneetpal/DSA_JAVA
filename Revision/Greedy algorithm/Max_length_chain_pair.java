import java.util.*;
class Max_length 
{
    public void maxlength(int arr[][])
    {
        Arrays.sort(arr,Comparator.comparing(o->o[1]));
        int prevend=arr[0][1];// chain end
        int total_pair=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0]>=prevend)
            {
                total_pair++;
                prevend=arr[i][1];

            }
        }
        System.out.println(" "+total_pair);
    }
}


public class Max_length_chain_pair 
{
    public static void main(String[] args) {
         int arr[][]={{5,24},{39,60},{5,28},{27,40},{27,40},{50,90}};
         Max_length m=new Max_length();
         m.maxlength(arr);
    }
    
}
