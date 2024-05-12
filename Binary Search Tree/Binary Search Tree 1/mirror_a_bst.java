class Mirror 
{
    static class node 
    {
        node right;
        node left;
        int data;
        node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
        }
        public static node build(node root , int val)
        {
            if(root==null)
            {
                root=new node(val);
                return root;
            }
            if(root.data<val)
            {
                root.right=build(root.right, val);
            }
            if(root.data>val)
            {
                root.left=build(root.left, val);
            }
            return root;
        }
        public static node mirror(node root)
        {
            if(root==null)
            {
                return root;
            }
            node leftS=mirror(root.left);
            node rightS=mirror(root.right);
            root.left=rightS;
            root.right=leftS;
            return root;
            
        }
        public static void preorder(node root)
        {
            if(root==null)
            {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}
public class mirror_a_bst {
    public static void main(String[] args)  
    {
        int Values[]={1,6,3,4,2,7};
        Mirror.node root=null;
        for(int i=0;i<Values.length;i++)
        {
            root=Mirror.node.build(root, Values[i]);
        }
        System.out.println("before");
        Mirror.node.preorder(root);
        Mirror.node.mirror(root);
        System.out.println("after");
        Mirror.node.preorder(root);

    }
    
}
