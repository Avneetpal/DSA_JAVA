import java.util.*;
class job 
{
    public static void job_sequence(int job[][])
    {
        Arrays.sort(job,Comparator.comparing(o->o[1]));
        int time=0;
        int profit=0;
        for(int i=job.length-1;i>=0;i--)
        {
            if(time<job[i][0])
            {
                time++;
                profit=profit+job[i][1];

            }
        }
        System.out.println("max profit "+profit);


    }
}



public class job_sequencing_problemm {
    public static void main(String[] args) {
        int jobb[][]={{4,20},{1,10},{1,40},{1,50}};
        job.job_sequence(jobb);
    }
    
}
