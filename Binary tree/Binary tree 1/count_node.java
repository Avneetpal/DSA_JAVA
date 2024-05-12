class buildTree
{
    static class node
    {
        node left;
        node right;
        int data;
        node (int data)
        {
            this.left=null;
            this.right=null;
            this.data=data;
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
        public static int number(node root)
        {
            if(root==null)
            {
                return 0;
            }
            int ln=number(root.left);
            int rn=number(root.right);
            int number=ln+rn+1;
            return number;
        }
    }
}

public class count_node {
    public static void main(String[] args) {
        int Node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        buildTree.node root=buildTree.node.tree(Node);
        System.out.println(buildTree.node.number(root));
        
    }
    
}
