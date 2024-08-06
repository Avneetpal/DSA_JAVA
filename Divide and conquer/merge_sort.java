class merge
{
    public void printarray(int num[])
    {
        for(int i=0;i<num.length;i++)
        {
            System.out.print(" "+num[i]);
        }
       
    }
    public void merg(int arr[],int start, int end)
    {
        if(start>=end)
        {
            return;
        }
        int mid=start+(end-start)/2;
        //call merge recursively
        //left part
        merg(arr, start, mid);
        // right part
        merg(arr, mid+1, end);
        // call new function
        newmerge(arr, start, end, mid);

    }

    public void newmerge(int arr[],int start,int end,int mid)
    {   
        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=end) 
        {
            if(arr[i]>arr[j])
            {
                temp[k]=arr[j];
                j++;
            }
            else{
                temp[k]=arr[i];
                i++;
            }
            k++;

        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
            

        }
        while (j<=end) 
        {
            temp[k++]=arr[j++];
            

        }
        // copy temp to arr
        for(k=0,i=start;k<temp.length;k++,i++)
        {   
           arr[i]=temp[k];

        }




    }
}
class MIAN 
{
    public static void main(String[] args) {
        int num[]={4,3,5,2,6};
        
        merge m=new merge();
        m.merg(num, 0, num.length-1);
        
        m.printarray(num);


    }
}