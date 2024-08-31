class BST 
{
    static class Node
    {
        Node left;
        Node right;
        int data;
        Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public  static Node insert(Node root, int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;
        }
        if(root.data>val)
        {
            root.left=insert(root.left, val);
        }
        if(root.data<val)
        {
            root.right=insert(root.right, val);

        }
        return root;
    } 
    // in BST inorder gives the sorted  output
    public static void Inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(" "+root.data);
        Inorder(root.right);
    }
}

class MAIN 
{
    public static void main(String[] args) {
        int val[]={3,4,1,5,2};
        BST.Node root=null;
        for(int i=0;i<val.length;i++)
        {
            root=BST.insert(root, val[i]);
        }
        System.out.println("root=="+root.data);
        BST.Inorder(root);
    }
}