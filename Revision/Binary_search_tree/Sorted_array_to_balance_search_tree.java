class BSTT
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
    public static Node build(int arr[], int start, int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
        root.left=build(arr, start, mid-1);
        root.right=build(arr, mid+1, end);
        return root;

    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+"  ");
        preorder(root.left);
        preorder(root.right);

    }
}

public class Sorted_array_to_balance_search_tree 
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
       BSTT.Node root= BSTT.build(arr, 0, arr.length-1);
        BSTT.preorder(root);
    }
    
}
