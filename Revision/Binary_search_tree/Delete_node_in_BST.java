class Delete 
{
    static class Node 
    {
        Node left;
        Node right;
        int data;
        Node (int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
            
        }
    }
    public static Node insert(Node root, int val)
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
    public static Node delete(Node root,int val)
    {
        if(root.data>val)
        {
          root.left=delete(root.left, val);

        }
        else if(root.data<val)
        {
            root.right=delete(root.right, val);
        }
        else
        {
            // case 1 no child
            if(root.left==null && root.right==null)
            {
                return null;
            }
            // case 2 one child
            if(root.left==null)
            {
                return root.right;
            }
            if(root.right==null)
            {
                return root.left;
            }
            // case 3 two child
            Node Is=InorderSuccessor(root.right);
            root.data=Is.data;
            root.right=delete(root.right, Is.data);
           
        }
        return root;
    }
    public static Node InorderSuccessor(Node root)
    {
        while (root.left!=null) 
        {
            root=root.left;
            
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
}
public class Delete_node_in_BST 
{
    public static void main(String[] args) 
    {
        int val[]={3,4,1,2,5};
        Delete.Node root=null;
        for(int i=0;i<val.length;i++)
        {
            root=Delete.insert(root, val[i]);
        }
        Delete.delete(root, 2);
        Delete.inorder(root);

    }
    
}
