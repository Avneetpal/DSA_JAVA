class post_order 
{
    static class Node 
    {
        Node left;
        Node right;
        int data;
        Node (int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class buildtree
    {
        static int idx=-1;
        public Node tree_build(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newnNode=new Node(nodes[idx]);
            newnNode.left=tree_build(nodes);
            newnNode.right=tree_build(nodes);
            return newnNode;
        }
        public void postorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }
}

public class post_order_traversal {
    public static void main(String[] args) {
        post_order.buildtree b=new post_order.buildtree();
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        post_order.Node root=b.tree_build(nodes);
        b.postorder(root);
    }
    
}
