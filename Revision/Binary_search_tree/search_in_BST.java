class Search 
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
    public static Node insert(Node root,int val)
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
    public static boolean searc(Node root,int val)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==val)
        {
            return true;
        }
        if(val>root.data)
        {
           return searc(root.right, val);
        }
        if(val<root.data)
        {
            return searc(root.left, val);
        }
        return false;
    }
}

public class search_in_BST {
    public static void main(String[] args) {
        int val[]={3,4,1,2,5};
        Search.Node root=null;
        for(int i=0;i<val.length;i++)
        {
            root=Search.insert(root, val[i]);
        }
        System.out.println(Search.searc(root, 5));
    }
    
}
