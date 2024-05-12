class BinaryST
{
    static class node{
        node left;
        node right;
        int data;
        node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
        public static node build(node root,int val)
        {
            if(root==null)
            {
                root=new node(val);
                return root;

            }
            if(root.data>val)
            {
               root.left= build(root.left, val);
            }
            if(root.data<val)
            {
               root.right= build(root.right, val);
            }
            return root;
        }
        public static boolean isvalid(node root, node max, node min)
        {
            if(root==null)
            {
                return true;
            }
            if(min!=null && root.data<=min.data)
            {
                return false;
            }
            else if(max!=null && root.data>=max.data)
            {
                return false;
            }
            return isvalid(root.left, root, min) && isvalid(root.right, max, root);
        }

    }
}

public class validate_bst {
    public static void main(String[] args) 
    {
        int Values[]={1,6,3,4,2,7};
        BinaryST.node root=null;
        for(int i=0;i<Values.length;i++)
        {
           root= BinaryST.node.build(root, Values[i]);
        }
        BinaryST.node max=null;
        BinaryST.node min=null;
        System.out.println(BinaryST.node.isvalid(root, max, min));
        
    }
    
}
