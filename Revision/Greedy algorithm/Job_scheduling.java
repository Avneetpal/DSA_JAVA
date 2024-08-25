import java.util.ArrayList;
import java.util.Collections;

class Job_schedule 
{
    public static class job
    {
        int profit;
        int id;
        int deadline;
        job(int p,int i, int d)
        {
            this.profit=p;
            this.id=i;
            this.deadline=d;
        }
    }
    public void jobc(int jobinfo[][])
    {
        ArrayList<job> jobs=new ArrayList<>();
        for(int i=0;i<jobinfo.length;i++)
        {
            jobs.add(new job(jobinfo[i][1],i,jobinfo[i][0]));
        }
        // sorting on basis of profit
        Collections.sort(jobs,(a,b) -> b.profit-a.profit);// for descending order sort
        // to sort in ascending order a.profit-b.profit
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobinfo.length;i++)
        {
            job curr=jobs.get(i);
            if(curr.deadline>time)
            {
                seq.add(curr.id);
                time++;
            }

        }
        System.out.println(" "+ seq);

    }
}

 class job_scheduling {
    public static void main(String[] args) {
        int jobinfo[][]={{4,20},{1,10},{1,40},{1,20}};
        Job_schedule j=new Job_schedule();
        j.jobc(jobinfo);
    }
    
}
