class Count_node 
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
    public static int count(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=count(root.left);
        int rh=count(root.right);
        return lh+rh+1;
    }
}

public class count_nodes {
    public static void main(String[] args) {

        Count_node.Node root=new Count_node.Node(1);
        root.left=new Count_node.Node(2);
        root.right=new Count_node.Node(3);
        root.left.left=new Count_node.Node(4);
        root.left.right=new Count_node.Node(5);
        root.right.left=new Count_node.Node(6);
        root.right.right=new Count_node.Node(7);
        System.out.println(Count_node.count(root));

    }
    
}
