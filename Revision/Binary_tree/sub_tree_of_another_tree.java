class subtree 
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
    public static  boolean isIdentical(Node root, Node subroot)
    {   
        if(root==null && subroot==null)
        {
            return true;
        }
        else if(root==null || subroot==null || root.data!=subroot.data)
        {
            return false;
        }
      
        return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);

    }
    public  static boolean issubtree(Node root, Node subroot)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==subroot.data)
        {
            if(isIdentical(root, subroot))
            {
                return true;
            }
        }
        return issubtree(root.left, subroot) || issubtree(root.right, subroot);
    }
}

class subtreee
{
    public static void main(String[] args) 
    {
        subtree.Node root=new subtree.Node(1);
        root.left=new subtree.Node(2);
        root.right=new subtree.Node(3);
        root.left.left=new subtree.Node(4);
        root.left.right=new subtree.Node(5);
        root.right.left=new subtree.Node(6);
        root.right.right=new subtree.Node(7);

        subtree.Node subroot=new subtree.Node(2);
        subroot.left=new subtree.Node(4);
        subroot.right=new subtree.Node(5);
        System.out.println(subtree.issubtree(root, subroot));
    }
}