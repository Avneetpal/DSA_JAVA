import java.util.ArrayList;

class BST_2_BALNCED_BST
{
    static class Node
    {
        Node left;
        Node right;
        int data;
        Node(int data)
        {
            this.left=null;
            this.right=null;
            this.data=data;

        }
    }
        public static Node createBSt(ArrayList<Integer> inorder, int start, int end)
        {
            if(start>end)
            {
                return null;
            }
            int mid=(start+end)/2;
            Node root=new Node(inorder.get(mid));
            root.left=createBSt(inorder, start, mid-1);
            root.right=createBSt(inorder, mid+1, end);
            return root;
        }
        public static void inorder(Node root, ArrayList<Integer> inordr)
        {
            if(root==null)
            {
                return;
            }
            inorder(root.left, inordr);
            inordr.add(root.data);
            inorder(root.right, inordr);  
        }
        public static Node balancedBSt(Node root)
        {
            // inorder
            ArrayList<Integer> inorder=new ArrayList<>();
            inorder(root, inorder);
            // balanced bst
            createBSt(inorder, 0, inorder.size()-1);
            return root;

        }
        public static void preorder(Node root)
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
public class Binary_search_tree_to_balnced_binary_search_tree 
{
    public static void main(String[] args) 
    {
        BST_2_BALNCED_BST.Node root=new BST_2_BALNCED_BST.Node(8);
        root.left=new BST_2_BALNCED_BST.Node(6);
        root.left.left=new BST_2_BALNCED_BST.Node(5);
        root.left.left=new BST_2_BALNCED_BST.Node(3);

        root.right=new BST_2_BALNCED_BST.Node(10);
        root.right.right=new BST_2_BALNCED_BST.Node(11);
        root.right.right=new BST_2_BALNCED_BST.Node(12);
        root= BST_2_BALNCED_BST.balancedBSt(root);
        BST_2_BALNCED_BST.preorder(root);


    }
    
}
