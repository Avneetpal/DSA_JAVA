class Sum
{
    static class Node
    {
        Node left;
        Node right;
        int data;
        Node(int data)
        {
            this.left=null;
            this.right=null;
            this.data=data;
        }
    }
    public  static int sum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int ls=sum(root.left);
        int rs=sum(root.right);
        return ls+rs+root.data;  
    }
}

public class sum_of_nodes {
    public static void main(String[] args) {

        Sum.Node root=new Sum.Node(1);
        root.left=new Sum.Node(2);
        root.right=new Sum.Node(3);
        root.left.left=new Sum.Node(4);
        root.left.right=new Sum.Node(5);
        root.right.left=new Sum.Node(6);
        root.right.right=new Sum.Node(7);
        System.out.println(Sum.sum(root));
        
    }
    
}
