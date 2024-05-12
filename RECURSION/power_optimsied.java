import java.util.*;
class poe 
{
    public int pp(int a,int n)
    {
    if(n==0){
        return 1;
    }
    int halfpower=pp(a, n/2);
    int halfpowersq=halfpower*halfpower;
    if(n%2!=0)
    {
        return a*halfpowersq;
    }
    return halfpowersq;
    }
}



 class power_optimsied {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int e=a.nextInt();
        poe p=new poe();
       int out= p.pp(n, e);
       System.out.println(""+out);
       a.close();
    }
    
}
