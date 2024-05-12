import java.util.*;
class level_order 
{
    static class node
    {
        int data;
        node left;
        node right;
        node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class binarytree
    {
        static int idx=-1;
        public static node buildTree(int Node[])
        {
            idx++;
            if(Node[idx]==-1)
            {
                return null;
            }
            node newnode =new node(Node[idx]);
            newnode.left=buildTree(Node);
            newnode.right=buildTree(Node);
            return newnode;
        }
        public static void level_order(node root)
        {
            if(root ==null)
            {
                return;
            }
            Queue<node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) 
            {
                node currnode=q.remove();
                if(currnode==null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else
                    {
                        q.add(null);
                    }
                }
                else
                {
                    System.out.print(currnode.data+" ");
                    if(currnode.left!=null)
                    {
                        q.add(currnode.left);
                    }
                    if(currnode.right!=null)
                    {
                        q.add(currnode.right);
                    }

                }
                
            }

        }


    }
}
public class level_order_traversal {
    public static void main(String[] args) {
        int Node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     
        level_order.node root=   level_order.binarytree.buildTree(Node);
        level_order.binarytree.level_order(root);

    }
    
}
