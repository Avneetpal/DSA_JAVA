class build 
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
    public static node tree(int Node[])
    {
        idx++;
        if(Node[idx]==-1)
        {
            return null;
        }
        node newnode=new node(Node[idx]);
        newnode.left=tree( Node);
        newnode.right=tree(Node);
        return newnode;

    }
    public static int sum(node root)
    {
        if(root==null)
        {
            return 0 ;
        }
        int ln=sum(root.left);
        int rn=sum(root.right);
        int sum=ln+rn+root.data;
        //System.out.println( sum);
        return sum;

    }
}
}


public class sum_of_nodes {
    public static void main(String[] args) {
        int Node[]={2,4,-1,-1,5,-1,-1};
        build.node root=build.node.tree(Node);
     System.out.println(   build.node.sum(root));
    }
    
}
