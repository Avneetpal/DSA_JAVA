class tree_height 
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
    
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;   
    }
}

public class height_of_tree {
    public static void main(String[] args) {
        /*
                    1
                /           \ 
            2                   3
        4           5       6           7

         */
        tree_height.Node root=new tree_height.Node(1);
        root.left=new tree_height.Node(2);
        root.right=new tree_height.Node(3);
        root.left.left=new tree_height.Node(4);
        root.left.right=new tree_height.Node(5);
        root.right.left=new tree_height.Node(6);
        root.right.right=new tree_height.Node(7);
        System.out.println(tree_height.height(root));




    }
    
}
