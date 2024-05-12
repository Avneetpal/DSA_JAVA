// approach 1 time complexity O(n^2)
//import java.util.*;
class tree
{
    static class node
    {
        node left;
        node right;
        int data;
        node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    
    static int idx=-1;
    public static node buildtree(int Node[])
    {
        idx++;
        if(Node[idx]==-1)
        {
            return null;
        }
        node newnode=new node(Node[idx]);
        newnode.left=buildtree(Node);
        newnode.right=buildtree(Node);
        return newnode;

    }
    
    public static int height(node root)
    {
        if(root==null)
        {
            return 0;

        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int diameter(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftdia=diameter(root.left);
        int left_height=height(root.left);
        int rightdia=diameter(root.right);
        int right_height=height(root.right);
        int self_height= left_height+right_height+1;
        return Math.max(rightdia, Math.max(self_height,leftdia));
    
        }
    }
}
class diameter
{
    public static void main(String[] args) 
    {
        int Node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree.node root=tree.node.buildtree(Node);
        System.out.println(tree.node.diameter(root));
    }
}