import java.util.*;
class Root2leaf
{
    static class Node 
    {
        Node left;
        Node right;
        int data;
        Node (int data)
        {
            this.left=null;
            this.right=null;
            this.data=data;
        }

    }
    public static Node insert(Node root, int val)
    {
        if(root==null)
        {
            root=new Node(val);
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
    public static void print(ArrayList<Integer> arr)
    {
        for( int i =0;i<arr.size();i++)
        {
            System.out.print(" "+arr.get(i));
        }
        System.out.println();
    }
    public static void root2leaf(Node root, ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        arr.add(root.data);
        
        if(root.right==null && root.left==null)
        {
            print(arr);
        }
        root2leaf(root.left, arr);
        root2leaf(root.right, arr);
        arr.remove(arr.size()-1);

    }
}


public class root_to_leaf_path 
{
    public static void main(String[] args) {
        Root2leaf. Node root=null;
        int val[]={8,5,3,1,4,6,10,11,14};
        for(int i=0;i<val.length;i++)
        {
            root=Root2leaf.insert(root, val[i]);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        Root2leaf.root2leaf(root,arr);
    }
    
}
