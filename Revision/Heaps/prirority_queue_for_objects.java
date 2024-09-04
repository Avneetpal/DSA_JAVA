import java.util.*;
class priority 
{
    static class Student implements Comparable<Student>
    {
        String name;
        int rank;
        public Student(String name, int rank)
        {
            this.name=name;
            this.rank=rank;
        }
    @Override
    public  int compareTo(Student s2)
    {
        return this.rank-s2.rank;
    }

    }
    
}
public class prirority_queue_for_objects 
{
    public static void main(String[] args) {
        PriorityQueue<priority.Student> pq=new PriorityQueue<>();
        pq.add(new priority.Student("A",6) );
        pq.add(new priority.Student("g",1) );
        pq.add(new priority.Student("s",2) );
        pq.add(new priority.Student("c",3) );
        while (!pq.isEmpty()) 
        {
            System.out.println(pq.peek().name+"-->"+pq.peek().rank);
            pq.remove();
            
        }

    }
    
}
