import java.util.LinkedList;
import java.util.Queue;

class Leverorder 
{
    static class Node 
    {
        Node left;
        Node right;
        int data;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class binaryTree
    {
        static int idx=-1;
        public Node buildtree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newnNode =new Node(nodes[idx]);
            newnNode.left=buildtree(nodes);
            newnNode.right=buildtree(nodes);
            return newnNode;
        }
        public void levelorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) 
            {
                Node currNode=q.remove();
                if(currNode==null)
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
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null)
                    {
                        q.add(currNode.left);

                    }
                    if(currNode.right!=null)
                    {
                        q.add(currNode.right);
                    }
                }
                
            }
        }
    }
}


public class Level_order_traversal {
    public static void main(String[] args) {
            Leverorder.binaryTree l=new Leverorder.binaryTree();
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Leverorder.Node root=l.buildtree(nodes);
            l.levelorder(root);
    }
    
}
