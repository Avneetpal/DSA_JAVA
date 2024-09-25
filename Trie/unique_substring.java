class unique 
{
    static class Node 
    {
        Node childre[]=new Node[26];
        boolean eow=false;
        
        Node()
        {
            for(int i=0;i<childre.length;i++)
            {
                childre[i]=null;
            }
        }
    }
    static Node root=new Node();
   
    public static int countnode(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(root.childre!=null)
            {
                count+=countnode(root.childre[i]);
            }
        }
        return count+1;
    }
    public static void insert(String word)
    {
        Node curr=root;
        
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.childre[idx]==null)
            {
                curr.childre[idx]=new Node();
               
            }
            curr=curr.childre[idx];
        }
        curr.eow  =true;
    }
    public static void suffix(String word)
    {
        for(int i=0;i<word.length();i++)
        {
            String s =word.substring(i);
            insert(s);
        }
    }
}
public class unique_substring {
    public static void main(String[] args) {
        String s="ababa";
        unique.suffix(s);
        System.out.println(unique.countnode(unique.root));
       
    }
    
}
