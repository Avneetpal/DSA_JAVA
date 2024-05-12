class binarytree
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
    }
}
public class search_in_BST
{
    public static void main(String[] args) {
        int Values[]={1,6,3,4,2,7};
        binarytree.node root=null;
        for(int i=0;i<Values.length;i++)
        {
             root=binarytree.node.insert(root, Values[i]);
        }
        binarytree.node.inorder(root);
        binarytree.node.search(root, 7);


    }
}
