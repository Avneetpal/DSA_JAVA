class Range 
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
    public static Node insert(Node root , int val)
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
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }
    public static void print_range(Node root, int k1, int k2)
    {
        if(root==null)
        {
            return;
        }
        if(root.data>=k1 && root.data<k2 )
        {
            print_range(root.left, k1, k2);
            System.out.println(root.data);
            print_range(root.right, k1, k2);
        }
        else if(root.data>k1)
        {
            print_range(root.left, k1, k2);
        }
        else if(root.data<k2)
        {
            print_range(root.right, k1, k2);
        }
    }
}
public class print_in_range {
    public static void main(String[] args) {
        int val[]={3,4,1,2,5};
        Range.Node root=null;
        for(int i=0;i<val.length;i++)
        {
            root=Range.insert(root, val[i]);
        }
        //Range.inorder(root);
        Range.print_range(root, 2, 5);
    }
    
}
