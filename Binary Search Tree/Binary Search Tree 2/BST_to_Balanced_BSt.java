import java.util.*;
class BalancedBST 
{
    static class node
    {
        node right;
        node left;
        int data;
        node(int data)
        {
            this.right=null;
            this.left=null;
            this.data=data;

        }
        public static void getinorder(node root, ArrayList<Integer> arr)
        {
            if(root==null)
            {
                return;
            }
            getinorder(root.left, arr);
            arr.add(root.data);
            getinorder(root.right, arr);
        }
        public static void preorder(node root)
        {
            if(root==null)
            {
                return;
            }
            System.out.print(root.data+"  ");
            preorder(root.left);
            preorder(root.right);

        }
         
        public static node BalancedBT(node root)
        {
            ArrayList<Integer> arr=new ArrayList<>();
            getinorder(root, arr);
            int start=0;
            int end=arr.size()-1;
            return createtree(arr, start, end);
            
           

        }
        public static node createtree(ArrayList<Integer> arr, int start, int end)
        {
            if(start > end)
            {
                return null;
            }
            int mid=(start+end)/2;
            node root=new node(arr.get(mid));
            root.left=createtree(arr, start, mid-1);
            root.right=createtree(arr, mid+1, end);
            return root;
            
        }
    
    }
}
public class BST_to_Balanced_BSt {
    public static void main(String[] args) {
        BalancedBST.node root= new BalancedBST.node(8);
        root.left=new BalancedBST.node(6);
        root.left.left=new BalancedBST.node(5);
        root.left.left.left=new BalancedBST.node(3);
        root.right=new BalancedBST.node(10);
        root.right.right=new BalancedBST.node(11);
        root.right.right.right=new BalancedBST.node(12);
       BalancedBST .node newroot= BalancedBST.node.BalancedBT(root);
       BalancedBST.node.preorder(newroot);

       



    }
    
}
