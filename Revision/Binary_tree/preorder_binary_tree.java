class preorder 
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
            
        }
    }
    static class Binarytree
    {
        static int idx=-1;
        public Node buildtree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newnNode=new Node(nodes[idx]);
            newnNode.left=buildtree(nodes);
            newnNode.right=buildtree(nodes);

            return newnNode;


            
        }
    }
    public static void preorderr(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(" " +root.data);
        preorderr(root.left);
        preorderr(root.right);
    }
    
}
class MAIN 
{
    public static void main(String[] args) {
        int Node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        preorder.Binarytree p=new preorder.Binarytree();
       preorder.Node root= p.buildtree(Node);
       System.out.println("root node  "+root.data);
       System.out.println("preorder");
       preorder.preorderr(root);

    }
}
   