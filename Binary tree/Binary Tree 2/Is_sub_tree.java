// // not working check again

// class binary
// {
//     static class node
//     {
//         node left;
//         node right;
//         int data;
//         node(int data)
//         {
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         }

    
//     static int idx=-1;
//     public static node buildtree(int Node[])
//     {
//         idx++;
//         if(Node[idx]==-1)
//         {
//             return null;
//         }
//         node newnode=new node(Node[idx]);
//         newnode.left=buildtree(Node);
//         newnode.right=buildtree(Node);
//         return newnode;

//     }
    
//     public static int height(node root)
//     {
//         if(root==null)
//         {
//             return 0;

//         }
//         int lh=height(root.left);
//         int rh=height(root.right);
//         return Math.max(lh, rh)+1;
//     }
//     public static boolean isidentical(node node, node subroot)
//     {
//         if(node==null && subroot==null)
//         {
//             return true;

//         }
//         else if(node ==null || subroot==null || node.data!=subroot.data)
//         {
//             return false;
//         }
//         if(!isidentical(node.left, subroot.left))
//         {
//             return false;
//         }
//         if(!isidentical(node.right, subroot.right))
//         {
//             return false;
//         }
//         return true;

//     }
//     public static boolean subtree(node root, node subroot)
//     {
//         if (root==null) 
//         {
//             return false;
            
//         }
//         if(root.data==subroot.data)
//         {
//             if(isidentical(root, subroot))
//             {
//                 return true;
//             }
//         }
//         return subtree(root.left, subroot)|| subtree(root.right, subroot);
//     }
//     }
// }
// public class Is_sub_tree {
//     public static void main(String[] args) {
//         int Node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         int subtree[]={2,4,-1,-1,5,-1,-1};
//         binary.node root=binary.node.buildtree(Node);
//         binary.node subroot=binary.node.buildtree(subtree);
//         System.out.println(binary.node.subtree(root, subroot));

        
//     }
    
// }
