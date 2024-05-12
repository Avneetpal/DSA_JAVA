import java.util.*;
class objects 
{
    static class Student implements Comparable<Student>
    // comparable class is used to compare the objects
    {
        String name;
        int rank;
        public Student(String name, int rank)
        {
            this.rank=rank;
            this.name=name;
        }
        @Override
        public int compareTo(Student s2)
        {
            return this.rank-s2.rank;
        }
    }
}

public class pririoty_queus_for_objects {
    public static void main(String[] args) {
        PriorityQueue<objects.Student> p=new PriorityQueue<>();
        p.add(new objects.Student(" abc", 6));
        p.add(new objects.Student(" sbc", 3));
        p.add(new objects.Student(" absc", 1));
        p.add(new objects.Student(" ad", 8));
        p.add(new objects.Student(" hhh", 2));
        while (!p.isEmpty()) 
        {
            System.out.println(p.peek().name+"->"+ p.peek().rank);
            p.remove();
            
        }

    }
    
}
