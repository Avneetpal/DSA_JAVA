class Diameter_of_TREE 
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
    static class Info
    {
        int diam;
        int ht;
        Info(int diam,int ht)
        {
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root)
    {
        if(root==null)
        {
            return new Info(0, 0);
        }
        Info left=diameter (root.left);
        Info right=diameter (root.right);

        int diam=Math.max(Math.max(left.diam, right.diam),left.ht+right.ht+1);
        int ht=Math.max(left.ht, right.ht)+1;
        return new Info(diam, ht);
    }
} 
class diameter
{
    public static void main(String[] args) 
    {
        Diameter_of_TREE .Node root=new Diameter_of_TREE .Node(1);
        root.left=new Diameter_of_TREE .Node(2);
        root.right=new Diameter_of_TREE .Node(3);
        root.left.left=new Diameter_of_TREE .Node(4);
        root.left.right=new Diameter_of_TREE .Node(5);
        root.right.left=new Diameter_of_TREE .Node(6);
        root.right.right=new Diameter_of_TREE .Node(7);
        System.out.println(Diameter_of_TREE .diameter(root).diam);    
    }
    
}
