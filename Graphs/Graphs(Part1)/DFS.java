import java.util.*;
class depth 
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
    public static void dfs(ArrayList<edge>graph[], int curr, boolean vis[])
    {
        System.out.print(curr+"  ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            edge e=graph[curr].get(i);
            if(!vis[e.dest])
            {
                dfs(graph, e.dest, vis);
            }
        }
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
public class DFS {
    public static void main(String[] args) {
        /*
                  1-----3 
                /       |   \
                0       |    5----6
                \2----  4   /
         */
        int v=7;
        @SuppressWarnings("unchecked")
        ArrayList<depth.edge> [] graph=new ArrayList[v];
        depth.creategraph(graph);
        depth.dfs(graph, 0,new boolean[v]);
    }
    
}

