class startwith 
{
    static class Node 
    {
        Node childern[]=new Node[26];
        boolean eow=false;
        Node()
        {
            for(int i=0;i<childern.length;i++)
            {
                childern[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.childern[idx]==null)
            {
                curr.childern[idx]=new Node();
            }
            curr=curr.childern[idx];
        }
        curr.eow=true;
    }
    public static boolean startswith(String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.childern[idx]==null)
            {
                return false;
            }
            curr=curr.childern[idx];
        }
        return true;
    } 
}
public class Start_with_problem {
    public static void main(String[] args) {
        String arr[]={"mango","man","app","apple"};
        for(int i=0;i<arr.length;i++)
        {
            startwith.insert(arr[i]);
        }
        System.out.println(startwith.startswith("nn"));
    }
    
}
