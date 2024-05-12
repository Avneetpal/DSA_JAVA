import java.util.*;
class function
{
    public void reverse(int n[])
    {
        int start=0;
        int end =n.length-1;
        //int i=0;
        int temp;
        while(start<end)
        {
             temp=n[start];
             n[start]=n[end];
             n[end]=temp;
             ++start;
             --end;

        }
    }
}
class reve 
{
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        int[] numbers=new int[10];
        for(int i=0;i<=numbers.length-1;i++)
        {
            numbers[i]=a.nextInt();
        }
        function ff = new function();
        ff.reverse(numbers);
        for(int j=0;j<numbers.length;j++)
        {
            System.out.println(""+numbers[j]);
        }

    }
}