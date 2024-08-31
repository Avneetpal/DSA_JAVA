class Validate 
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
        else  
        {
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static boolean valide(Node root , Node min ,Node max)
    {
        if(root==null)
        {
            return true;
        }
        if(min!=null && root.data<=min.data)
        {
            return false;
        }
        if(max!=null && root.data>=max.data)
        {
            return false;
        }
        return valide(root.left, min, root) && valide(root.right, root, max);


    }

}

public class validate_bst {
    public static void main(String[] args) {
        Validate.Node root=null;
        int val[]={2,3,4,1,5};
        for(int i=0;i<val.length;i++)
        {
            root=Validate.insert(root,val[i]);
        }
        System.out.println(Validate.valide(root, null, null));
    }
    
}
