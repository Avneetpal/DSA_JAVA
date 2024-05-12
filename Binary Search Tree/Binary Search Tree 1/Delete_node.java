class binartree
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
        public static node insert(node root, int val)
        {
            if(root==null)
            {
                root=new node(val);
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
        public static void inorder(node root)
        {
            if(root==null)
            {
                return;
            }
            inorder(root.left);
            System.out.print("  "+root.data);
            inorder(root.right);
        }
        public static boolean search(node root,int key)
        {
            if(root==null)
            {
                System.out.println("not found");
                return false;
            }
            if(root.data==key)
            {
                System.out.println("found");
                return true;
            }
            if(root.data>key)
            {
               return search(root.left, key);
            }
            else 
            {
               return search(root.right, key);
                
            }
            //return false;
        }
        public static node delete(node root,int key)
        {
            if(root.data>key)
            {
                root.left=delete(root.left, key);
            }
            else if(root.data<key)
            {
                root.right=delete(root.right, key);
            }
            else
            {
                // case 1
                if(root.left==null && root.right==null)
                {
                    return null;
                }
                // case 2
                if(root.left==null)
                {
                    return root.right;
                }
                else if(root.right==null)
                {
                        return root.left;
                }
                // case 3
                node IS=in_order_succseor(root.right);
                root.data=IS.data;
                root.right=delete(root.right, IS.data);
            }
            return root;

        }
        public static node in_order_succseor(node root)
        {
            while (root.left!=null) 
            {
                root=root.left;
                
            }
            return root;

        }
    }
}
public class Delete_node
{
    public static void main(String[] args) {
        int Values[]={1,6,3,4,2,7};
        binartree.node root=null;
        for(int i=0;i<Values.length;i++)
        {
             root=binartree.node.insert(root, Values[i]);
        }
        // binartree.node.inorder(root);
        // binartree.node.search(root, 7);
        binartree.node roo=binartree.node.delete(root, 6);
        binartree.node.inorder(roo);



    }
}








