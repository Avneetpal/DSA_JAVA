import java.util.*;
class BSTT
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
        public static node buildtree(node root, int val)
        {
            if(root==null)
            {
                root=new node(val);
                return root;
            }
            if(root.data>val)
            {
                root.left=buildtree(root.left, val);
            }
            if(root.data<val)
            {
                root.right=buildtree(root.right, val);
            }
            return root;
        }
        public static void root2leaf(node root, ArrayList<Integer> path)
        {
            if(root==null)
            {
                return;
            }
            path.add(root.data);
            if(root.left==null && root.right==null)
            {
                printpath(path);
            }
            root2leaf(root.left, path);
            root2leaf(root.right, path);
            path.remove(path.size()-1);

        }
        public static void printpath(ArrayList<Integer> path)
        {
            for(int i=0;i<path.size();i++)
            {
                System.out.print(path.get(i)+" ");
            }
            System.out.println();
        }
    }
}
public class root_to_leaf_path {
    public static void main(String[] args) {
        int Values[]={1,6,3,4,2,7};
        BSTT.node root=null;
        ArrayList<Integer> path=new ArrayList<>();
        for(int i=0;i<Values.length;i++)
        {
            root=BSTT.node.buildtree(root, Values[i]);
        }
        BSTT.node.root2leaf(root, path);
       
    }
    
}
