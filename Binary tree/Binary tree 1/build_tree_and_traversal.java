class tree 
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
    static class binarytree{
    static int idx=-1;
    public static node buildTree(int Node[])
    {
        idx++;
        if(Node[idx]==-1)
        {
            return null;
        }
        node newnode=new node(Node[idx]);
        newnode.left=buildTree(Node);
        newnode.right=buildTree(Node);
        return newnode;
    }
    // pre order treaversal
    public static void preorder(node root)
    {
        if(root==null)
        {
            //System.out.print(-1+" ");// to print same as quetion
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    // in order treversal
    public static void inorder(node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(node root)
    {
        if(root== null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

}
}
class MAIN 
{
    public static void main(String[] args) 
    {
        int Node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       tree.node root=tree.binarytree.buildTree(Node);
       System.out.println(" root of tree "+root.data);
       System.out.println("preorder");
       tree.binarytree.preorder(root);
       System.err.println();
       System.out.println("inorder");
       tree.binarytree.inorder(root);
       System.out.println();
       System.out.println("postorder");
       tree.binarytree.postorder(root);
        
    }
}