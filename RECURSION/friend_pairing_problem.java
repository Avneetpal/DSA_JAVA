import java.util.*;
class friend 
{
    public static int friends(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        int pair=(n-1)*friends(n-2);
        int Single=friends(n-1);
        return pair+Single;
    }
}



public class friend_pairing_problem {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        //friend f=new friend();
        int r=  friend.friends(n);
        System.out.println(r);
        a.close();

    }
    
}
