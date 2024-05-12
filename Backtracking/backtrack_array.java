class changearray
{
    public static void changearr(int n[],int i,int val)
    {
        // base case
        if(i==n.length)
        {
            pr(n);
            return;
        }
        // recusrion
        n[i]=val;
         changearr(n, i+1, val+1);// fucntion call step,step after functon call is backtracking step 
         n[i]=n[i]-2;// backtracking step
    }
    public static void pr(int n[])
    {
        for(int i=0;i<n.length;i++)
        {
            System.out.println(""+n[i]);
        }
    }
}
class array
{
    public static void main(String[] args) {
        int[] num=new int[5];
        changearray.changearr(num, 0, 1);
        changearray.pr(num);
    }
}