class Diameter 
{
    static class Node 
    {
        Node left;
        Node right;
        int data;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int diam(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftdiam =diam(root.left);
        int rightdiam=diam(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int selfdiam=rh+lh+1;
    
        return Math.max(Math.max(rightdiam, leftdiam), selfdiam);

    }

}


public class diameter_otree 
{
    public static void main(String[] args)
    {
        Diameter.Node root=new Diameter.Node(1);
        root.left=new Diameter.Node(2);
        root.right=new Diameter.Node(3);
        root.left.left=new Diameter.Node(4);
        root.left.right=new Diameter.Node(5);
        root.right.left=new Diameter.Node(6);
        root.right.right=new Diameter.Node(7);
        System.out.println(Diameter.diam(root));
    }
    
}
