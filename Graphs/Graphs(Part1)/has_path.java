import java.util.*;
class path 
{
    static class edge 
    {
        int src;
        int dest;
        int weight;
        edge(int s, int d, int w)
        {
            this.dest=d;
            this.src=s;
            this.weight=w;
        }
    }
    public static boolean haspath(ArrayList<edge> graph[], int src, int dist, boolean vist[])
    {
        if(src==dist)
        {
            return true;
        }
        vist[src]=true;
        for(int i=0;i<graph[src].size();i++)
        {
            edge e=graph[src].get(i);
            // e=neighbour
            if(!vist[e.dest] && haspath(graph,e.dest,dist,vist))
            {
                return true;
            }
            
        }
        return false;
    }
 
    public static void creategraph(ArrayList<edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));
        graph[1].add(new edge(1, 0, 1));
        graph[1].add(new edge(1, 3, 1));
        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 4, 1));
        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 5, 1));
        graph[4].add(new edge(4, 5, 1));
        graph[4].add(new edge(4, 3, 1));
        graph[4].add(new edge(4, 2, 1));
        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 4, 1));
        graph[5].add(new edge(5,6 , 1));
        graph[6].add(new edge(6, 5, 1));
    }
}
public class has_path {
    public static void main(String[] args) {
        /*
                  1-----3 
                /       |   \
                0       |    5----6
                \2----  4   /
         */
        int v=7;
        @SuppressWarnings("unchecked")
        ArrayList<path.edge> [] graph=new ArrayList[v];
        path.creategraph(graph);
        System.out.println(path.haspath(graph, 0, 5, new boolean[v]));
      
    }
    
}

