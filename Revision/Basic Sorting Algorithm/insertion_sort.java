class insertion 
{
    public void insert(int num[])
    {
        for(int i=1;i<num.length;i++)
        {
            int curr=num[i];
            int prev=i-1;
            while (prev>=0 && num[prev]>curr) 
            {
                num[prev+1]=num[prev];
                prev--;
                
            }
            num[prev+1]=curr;

        }
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}


public class insertion_sort {
    public static void main(String[] args) {
        int num[]={4,7,89,6,1};
        insertion i=new insertion();
        i.insert(num);
    }

    
}
