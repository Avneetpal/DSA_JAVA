

class tree 
{
    static class node
    {
        node left;
        node right;
        int data;
        node(int data)
        {
            this.left=null;
            this.right=null;
            this.data=data;
        }
        
         static int idx=-1;
        // public static node buildtree(int Node[])
        // {
        //     idx++;
          
        //     node newnode=new node(Node[idx]);
        //     newnode.left=buildtree(Node);
        //     newnode.right=buildtree(Node);
        //     return newnode;


        // }
        public static boolean isidentical(node root,node subroot)
        {
            if(root==null&& subroot==null)
            {
                return true;
            }
            else if(root==null|| subroot==null||root.data!=subroot.data)
            {
                return false;
            }
            if(!isidentical(root.left, subroot.left))
            {
                return false;
            }
            if(!isidentical(root.right, subroot.right))
            {
                return false;
            }
            return true;

        }
        public static boolean subtree(node root, node subroot)
        {
            if(root==null)
            {
                return false;
            }
            if(root.data==subroot.data)
            {
                if(isidentical(root, subroot))
                return true;

            }
            return subtree(root.left, subroot)|| subtree(root.right, subroot);
        }

    }
}
class Is_sub_tree
{
    public static void main(String[] args) {
        tree.node root=new tree.node(1);
        root.left=new tree.node(2);
        root.left.left=new tree.node(4);
        root.left.right=new tree.node(5);
        root.right=new tree.node(3);
        root.right.right=new tree.node(6);

        tree.node subroot=new tree.node(2);
        subroot.left=new tree.node(4);
        subroot.right=new tree.node(5);
        System.out.println(tree.node.subtree(root, subroot));


        
    }
}

