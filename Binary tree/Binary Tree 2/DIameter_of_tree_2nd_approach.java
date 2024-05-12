// 2nd aproach time complexity O(n);
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
    public static int diameter2(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftdia=diameter2(root.left);
        int left_height=height(root.left);
        int rightdia=diameter2(root.right);
        int right_height=height(root.right);
        int self_height= left_height+right_height+1;
        return Math.max(rightdia, Math.max(self_height,leftdia));
    }
    static class info
    {
        int ht;
        int diam;
        info(int diam,int ht)
        {
            this.diam=diam;
            this.ht=ht;
        }
    }

public static info diameter(node root)
{
    if(root==null)
    {
        return new info(0,0);
    }
    info leftinfo=diameter(root.left);
    info rightinfo=diameter(root.right);
    int diam=Math.max(Math.max(leftinfo.diam, rightinfo.diam),leftinfo.ht+rightinfo.ht+1);
    int ht=Math.max(leftinfo.ht, rightinfo.ht)+1;
    return new info(diam, ht);

}
    
  
       

}
}


public class DIameter_of_tree_2nd_approach {
    public static void main(String[] args) {
        int Node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree.node root=tree.node.buildtree(Node);
        System.out.println(tree.node.diameter(root).diam);
        
    }
}
