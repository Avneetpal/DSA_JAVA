import java.util.*;
class merge 
{
    static class node
    {
        node right;
        node left;
        int data;
        node (int data)
        {
            this.right=null;
            this.left= null;
            this.data=data;
        }
    }
    public static void getinorder(node root,ArrayList<Integer> arr)
    {
        if(root== null)
        {
            return;

        }
        getinorder(root.left, arr);
        arr.add(root.data);
        getinorder(root.right, arr);
    }
    public static node balancedBst(ArrayList<Integer> arr,int start, int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=(start+end)/2;
        node root=new node(arr.get(mid));
        root.left= balancedBst(arr, start, mid-1);
        root.right=balancedBst(arr, mid+1, end);
        return root;
    }

    public static node mergebst(node root1, node root2)
    {
        ArrayList<Integer> arr1=new ArrayList<>();
        getinorder(root1, arr1);
        ArrayList<Integer> arr2=new ArrayList<>();
        getinorder(root2, arr2);
        ArrayList<Integer> finalarr=new ArrayList<>();
        int i=0,j=0;
        while (i<arr1.size()&&j<arr2.size()) 
        {
            if(arr1.get(i)>arr2.get(j))
            {
                finalarr.add(arr2.get(j));
                j++;
            }
            else
            {
                finalarr.add(arr1.get(i));
                i++;
            }
        }
            while (i<arr1.size()) 
            {
                finalarr.add(arr1.get(i));
                i++;
                
            }
            while (j<arr2.size()) 
            {
                finalarr.add(arr2.get(j));
                j++;
                
            }
            
        
        return balancedBst(finalarr, 0, finalarr.size()-1);

    }
    public static void preorder(node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(" "+root.data);
        preorder(root.left);
        preorder(root.right);
    }
    
}
 class merge_2_bst {
    public static void main(String[] args) {
        merge.node root1=new merge.node(2);
        root1.left=new merge.node(1);
        root1.right=new merge.node(4);

        merge.node root2=new merge.node(9);
        root2.left=new merge.node(3);
        root2.right=new merge.node(12);
       merge.node root= merge.mergebst(root1, root2);
       merge.preorder(root);





    }
    
}
