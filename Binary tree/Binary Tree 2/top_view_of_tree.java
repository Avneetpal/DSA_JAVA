import java.util.*;
class build 
{
    static class node
    {
        node left;
        node right;
        int data;
        node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
        static int idx=-1;
        public static node tree(int Node[])
        {
            idx++;
            if(Node[idx]==-1)
            {
                return null;
            }
            node newnode=new node(Node[idx]);
            newnode.left=tree(Node);
            newnode.right=tree(Node);
            return newnode;


        }
        static class info
        {
            node node;
            int hd;// horizontal distance
            info(node node,int hd)
            {
                this.node=node;
                this.hd=hd;

            }
        }
        public static void topview(node root)
        {
            Queue<info> q=new LinkedList<>();
            HashMap<Integer,node> map=new HashMap<>();
            int min=0, max=0;
            q.add(new info(root, 0));
            q.add(null);
            while (!q.isEmpty()) 
            {
                info curr=q.remove();
                if(curr==null)
                {
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else
                    {
                        q.add(null);
                    }
                }
                else {
                if(!map.containsKey(curr.hd))
                {
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left!=null)
                {
                    q.add(new info(curr.node.left, curr.hd-1));
                    min=Math.min(min, curr.hd-1);

                }
                if(curr.node.right!=null)
                {
                    q.add(new info(curr.node.right,curr.hd +1));
                    max=Math.max(max, curr.hd+1);
                }
            }
        }
            for(int i=min;i<=max;i++)
            {
                System.out.print(map.get(i).data+" ");
            }     
        }
    }
}


public class top_view_of_tree {
    public static void main(String[] args) {
        int Node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        build.node root=build.node.tree(Node);
        build.node.topview(root);
    }   
}
