class Size 
{
    static class Node
    {
        Node left;
        Node right;
        int data;
        Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;        
        }
    }
    static class Info
    {
        Boolean isbst;
        int size;
        int min;
        int max;
        Info(Boolean isbst, int size, int min, int max)
        {
            this.size=size;
            this.isbst=isbst;
            this.min=min;
            this.max=max;
        }
    }
    public static int MAXBST=0;
    public static Info Information(Node root)
    {
        if (root ==null)
        {
            return new Info(true, 0, Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leInfo=Information(root.left);
        Info rInfo =Information(root.right);
        int size=leInfo.size+rInfo.size+1;
        int min=Math.min(root.data, Math.min(leInfo.min, rInfo.min));
        int max=Math.max(root.data, Math.max(leInfo.max, rInfo.max));

        if(root.data<=leInfo.max || root.data>=rInfo.min)
        {
            return new Info(false, size, min, max);
        }
        if(leInfo.isbst && rInfo.isbst)
        {
            MAXBST=Math.max(MAXBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }
}
public class size_of_largest_bst {
    public static void main(String[] args) {
        Size.Node root=new Size.Node(50);
        root.left=new Size.Node(30);
        root.left.left=new Size.Node(5);
        root.left.right=new Size.Node(20);

        root.right=new Size.Node(60);
        root.right.left=new Size.Node(45);
        root.right.right=new Size.Node(70);
        root.right.right.left=new Size.Node(65);
        root.right.right.right=new Size.Node(80);
        Size.Information(root);;
        System.out.println(Size.MAXBST);

    }
    
}
