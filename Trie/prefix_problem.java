class Prefix 
{
    static class Node 
    {
        Node childern[]=new Node[26];
        Boolean eow=false;
        int freq;
        Node()
        {
           for(int i=0;i<childern.length;i++)
           {
            childern[i]=null;
           } 
           freq=1;
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
            else
            {
                curr.childern[idx].freq++;
            }
            curr=curr.childern[idx];
        }
        curr.eow=true;
    }
    public static void prefixfinder(Node root, String ans)
    {
        if(root==null)
        {
            return;
        }
        if(root.freq==1)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.childern.length;i++)
        {
            if(root.childern[i]!=null)
            {
                prefixfinder(root.childern[i], ans+(char)(i+'a'));
            }
        }

    }
}

public class prefix_problem {
    public static void main(String[] args) {
        String arr[]={"zebra","dog","dove","duck"};
        for(int i=0;i<arr.length;i++)
        {
            Prefix.insert(arr[i]);
        }
        Prefix.root.freq=-1;
        Prefix.prefixfinder(Prefix.root,"");
    }
    
}
