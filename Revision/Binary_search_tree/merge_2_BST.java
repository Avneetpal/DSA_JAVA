import java.util.ArrayList;

class merge 
{
    static class Node
    {
        Node left;
        Node right;
        int data;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Renamed inorder method to inorderTraversal to avoid confusion
    public static void inorderTraversal(Node root, ArrayList<Integer> inorder)
    {
        if (root == null)
        {
            return;
        }
        inorderTraversal(root.left, inorder);
        inorder.add(root.data);
        inorderTraversal(root.right, inorder);
    }

    // Corrected mergee method to use two pointers instead of removing elements
    public static ArrayList<Integer> mergee(ArrayList<Integer> inorder1, ArrayList<Integer> inorder2)
    {
        ArrayList<Integer> tree = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < inorder1.size() && j < inorder2.size()) 
        {
            if (inorder1.get(i) < inorder2.get(j))
            {
                tree.add(inorder1.get(i));
                i++;
            }
            else
            {
                tree.add(inorder2.get(j));
                j++;
            }
        }
        
        // Add remaining elements
        while (i < inorder1.size())
        {
            tree.add(inorder1.get(i));
            i++;
        }
        while (j < inorder2.size())
        {
            tree.add(inorder2.get(j));
            j++;
        }
        
        return tree;
    }

    // Corrected createtree method to create a BST from a sorted array
    public static Node createtree(int arr[], int start, int end)
    {
        if (start > end)
        {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = createtree(arr, start, mid - 1);
        root.right = createtree(arr, mid + 1, end);
        return root;
    }

    public static Node mergeTrees(Node root1, Node root2)
    {
        ArrayList<Integer> inorder1 = new ArrayList<>();
        ArrayList<Integer> inorder2 = new ArrayList<>();
        inorderTraversal(root1, inorder1);
        inorderTraversal(root2, inorder2);
        ArrayList<Integer> mergedList = mergee(inorder1, inorder2);

        // Convert merged list back to a BST
        int[] mergedArray = mergedList.stream().mapToInt(i -> i).toArray();
        return createtree(mergedArray, 0, mergedArray.length - 1);
    }
}

public class merge_2_BST 
{
    public static void main(String[] args) 
    {
        int arr1[] = {1, 2, 4};
        int arr2[] = {3, 9, 12};
        merge.Node root1 = merge.createtree(arr1, 0, arr1.length - 1); 
        merge.Node root2 = merge.createtree(arr2, 0, arr2.length - 1);
        merge.Node mergedRoot = merge.mergeTrees(root1, root2);   
        
        // Print the inorder traversal of the merged tree
        ArrayList<Integer> mergedInorder = new ArrayList<>();
        merge.inorderTraversal(mergedRoot, mergedInorder);
        System.out.println(mergedInorder);
    }
}
