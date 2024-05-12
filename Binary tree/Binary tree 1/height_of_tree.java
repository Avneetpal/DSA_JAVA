//import java.util.*;
class binary 
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
        public static node buildTree(int Node[])
        {
            idx++;
            if(Node[idx]==-1)
            {
                return null;
            }
            node newnode=new node(Node[idx]);
            newnode.left=buildTree(Node);
            newnode.right=buildTree(Node);
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
            int height=Math.max(lh, rh)+1;
            return height;
        }
    }
}



public class height_of_tree {
    public static void main(String[] args) {
        int Node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary.node root=binary.node.buildTree(Node);
        System.out.println(binary.node.height(root));
        
    }
    
}
