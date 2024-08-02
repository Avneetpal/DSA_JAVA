public class sort {
    public static void main(String[] args) {
        int num[]={5,2,4,8,7};
        int i=0;
       
        for( i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
               
                if(num[i]>num[j])
                {
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
                }

            }
           

        }
        for(int k=0;k<num.length;k++)
        {
            System.out.println(""+num[k]);
        }
    }
    
}
