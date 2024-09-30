import java.util.*;

class graph
{
    static class edge 
    {
        int src;
        int dest;
        int weight;
        edge(int s, int d, int w)
        {
            this.weight=w;
            this.dest=d;
            this.src=s;
        }
    }
}
class MAin 
{
    public static void main(String[] args) {
        /*
                    (5)
               0------------1
                           /  \
                    (1)  /     \   (3)
                         /         \ 
                        2  ---- ---- 3
                        |     (1)
                        |
                    (2) |
                        4
        */
        int v=5;
        @SuppressWarnings("unchecked")
        ArrayList<graph.edge>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++)
        {
            graph[i]=new ArrayList<>();
        }
        // vertex 0
        graph[0].add(new graph.edge(0,1,5));
        // vertex 1
        graph[1].add(new graph.edge(1,0,5));
        graph[1].add(new graph.edge(1, 2, 1));
        graph[1].add(new graph.edge(1, 3, 3));
        // vertex 2
        graph[2].add(new graph.edge(2, 3, 1));
        graph[2].add(new graph.edge(2, 4, 2));
        graph[2].add(new graph.edge(2, 1, 1));
        // vertex 3
        graph[3].add(new graph.edge(3,1,3));
        graph[3].add(new graph.edge(3,2,1));
        // vertex 4
        graph[4].add(new graph.edge(4,2,2));

        // print all 2's neighbours
        for(int i=0;i<graph[2].size();i++)
        {
            graph.edge e=graph[2].get(i);
            System.out.println(e.dest);
        }



    }
}