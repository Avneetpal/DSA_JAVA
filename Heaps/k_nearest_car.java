import java.util.*;
 class car {

    static class point implements Comparable<point>
    {
        int x;
        int y;
        int distsq;
        int idx;
        public point(int x, int y, int distsq, int idx)
        {
            this.distsq=distsq;
            this.x=x;
            this.y=y;
            this.idx=idx;
        }
        @Override
        public int  compareTo(point p2)
        {
            return this.distsq-p2.distsq;
        }
    }
}
class  MAIN 
{
    public static void main(String[] args) {
        int point[][]={{3,3},{5,-1},{3,1}};
        int k=2;
        PriorityQueue<car.point> p=new PriorityQueue<>();
        for(int i=0;i<point.length;i++)
        {
            int distsq=(point[i][0]*point[i][0])+(point[i][1]*point[i][1]);
            p.add( new car.point(point[i][0],point[i][1],distsq,i));
        }
        for(int i=0;i<k;i++)
        {
            System.out.println("nearest car"+p.remove().idx);
        }
    }
}