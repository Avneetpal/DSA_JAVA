class BST 
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
        public static node insert(node root,int val)
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
            if (root.data<val) 
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
        public static void print_in__range(int k1 , int k2,node root)
        {
            if(root==null)
            {
                return;

            }
            if(root.data>=k1&& root.data<=k2)
            {
                print_in__range(k1, k2, root.left);
                System.out.print(root.data+"  ");
                print_in__range(k1, k2, root.right);
            }
           else  if(root.data<k1)
            {
                print_in__range(k1, k2, root.right);
            }
            else 
            {
                print_in__range(k1, k2, root.left);
            }
        }
    }
}


public class print_in_range {
    public static void main(String[] args) {
        int Values[]={1,6,3,4,2,7};
        BST.node root=null;
        for(int i=0;i<Values.length;i++)
        {
             root=BST.node.insert(root, Values[i]);
        }
        BST.node.inorder(root);
        System.out.println();
        BST.node.print_in__range(3, 7, root);

    }
    
}
