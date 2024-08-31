class Mirror 
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
        if(root==  null)
        {
            root=new  Node(val);
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
    public static Node mirror(Node root)
    {
        if(root==null)
        {
            return null;
        }
        Node ls=mirror(root.left);
        Node rs=mirror(root.right);
        root.right=ls;
        root.left=rs;
        return root;
    }
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+"-->");
        inorder(root.right);

    }
}
public class mirror_bst {
    public static void main(String[] args) {
        Mirror.Node root=null;
        int val[]={5,3,2,4,1};
        for(int i=0;i<val.length;i++)
        {
            root=Mirror.insert(root, val[i]);
        }
        System.out.println(" before");
        Mirror.inorder(root);
        Mirror.mirror(root);
        System.out.println();
        System.out.println("after");
        Mirror.inorder(root);
    }
    
}
