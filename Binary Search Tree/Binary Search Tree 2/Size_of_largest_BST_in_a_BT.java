// not working
class largest 
{
    static class node
    {
        node right;
        node left;
        int data;
        node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class info
    {
        boolean isbst;
        int size;
        int max;
        int min;
        public info(boolean isbst,int size,int max,int min)
        {
            this.isbst=isbst;
            this.size=size;
            this.max=max;
            this.min=  min;
        }
    }
    public  static int MAXBST=0;
    public static info largestbst(node root)
    {
        if(root==null)
        {
            return new info(false, 0, Integer.MIN_VALUE,Integer.MAX_VALUE );
        }
        info leftinfo=largestbst(root.left);
        info rightinfo=largestbst(root.right);
        int size=leftinfo.size+rightinfo.size+1;
        int min=Math.min(root.data, Math.min(leftinfo.min, rightinfo.min));
        int max=Math.max(root.data,Math.max(leftinfo.max, rightinfo.max));
        if(root.data<=leftinfo.max || root.data>=rightinfo.min)
        {
            return new info(false, size, max, min);
        }
        if(leftinfo.isbst && rightinfo.isbst)
        {
            MAXBST=Math.max(MAXBST, size);
            return new info(true, size, max, min);
        }
        return new info(false, size, max, min);

    }
}
public class Size_of_largest_BST_in_a_BT {
    public static void main(String[] args) {
        largest.node root=new largest.node(50);
        root.left=new largest.node(30);
        root.left.left=new largest.node(5);
        root.left.right=new largest.node(20);

        root.right=new largest.node(60);
        root.right.left=new  largest.node(45);
        root.right.right=new largest.node(70);
        root.right.right.left=new largest.node(65);
        root.right.right.right=new largest.node(80);
  largest.largestbst(root);
        System.out.println(largest.MAXBST);


    }
    
}
