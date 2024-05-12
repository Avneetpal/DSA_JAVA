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
        public static node tree(int arr[], int start, int end)
        {
            if(start>end)
            {
                return null;
            }
           int mid=(start+end)/2;
           node root=new node(arr[mid]);
           root.left=tree(arr, start, mid-1);
           root.right=tree(arr, mid+1, end);
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
class MAIN 
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int start=0;
        int end=arr.length-1;
        BST.node root=BST.node.tree(arr, start, end);
        BST.node.preorder(root);
        

        
    }
}