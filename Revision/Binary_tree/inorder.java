class inorder_binary 
{
    static class Node 
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data= data;
            this.right=null;
            this.left=null;
        }
    }
    static class binaryTree 
    {
        static int idx=-1;
        public Node buildtree(int node[])
        {
            idx++;
            if(node[idx]==-1)
            {
                return null;
            }
            Node newnNode=new Node(node[idx]);
            newnNode.left=buildtree(node);
            newnNode.right=buildtree(node);
            return newnNode;
        }
        public void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
}


public class inorder {
    public static void main(String[] args) {
        inorder_binary.binaryTree i=new inorder_binary.binaryTree();
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        inorder_binary.Node root=i.buildtree(nodes);
        i.inorder(root);
        
    }
    
}
