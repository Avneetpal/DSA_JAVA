import java.util.*;
class last 
{
    public static int occ(int n[],int key,int i)
    {
        if(i==-1)
        {
            return -1;
        }
        if(n[i]==key)
        {
            return i;
        }
        return occ(n, key, i-1);


    }
}
public class last_occurence {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int[] n=new int[5];
        for(int i=0;i<n.length;i++)
        {
            n[i]=a.nextInt();

        }
        System.out.println("enter key");
        int k=a.nextInt();
       
        System.out.println(""+last.occ(n, k,n.length-1));
        a.close();
    }

    }
    

