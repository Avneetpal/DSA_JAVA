import java.util.*;
class insertion 
{
    public void insert(int n[]){
    for(int i=1;i<n.length;++i)
    { 
        int curr=n[i];
        int prev=i-1;
    while (prev>=0&&n[prev]>curr) 
    {
        n[prev+1]=n[prev];
        prev--;       
    }
    n[prev+1]=curr;
        

    }
    System.out.println();
    for(int i=0;i<n.length;i++)
    {
        System.out.println(""+n[i]);
    }
}

}

 class insertion_sort {
    public static void main(String args[]) {
         Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int[] num=new int[n];
        for( int i=0;i<num.length;i++)
        {
            num[i]=a.nextInt();
        }
        insertion nn=new insertion();
        nn.insert(num);
        a.close();
        
    }
    
}
