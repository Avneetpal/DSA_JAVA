class TRIE 
{
    static class Node 
    {
        Node childer[]=new Node[26];
        Boolean eow=false;
        Node()
        {
            for(int i=0;i<26;i++)
            {
                childer[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word)
    {
        Node curr= root;
        for(int level=0;level<word.length();level++)
        {
            int idx=word.charAt(level)-'a';
            if(curr.childer[idx]==null)
            {
                curr.childer[idx]=new Node();
            }
            curr=curr.childer[idx];
        }
        curr.eow=true;
    }
    public static boolean search(String key)
    {
        Node curr=root;
        for(int i=0;i<key.length();i++)
        {
            int idx=key.charAt(i)-'a';
            if(curr.childer[idx]==null)
            {
                return false;
            }
            curr=curr.childer[idx];
        }
        return curr.eow==true;
    }
}
class MAIN 
{
    public static void main(String[] args) {
        String word[]={"the","a","there","thee","their","thee"};
        for(int i=0;i<word.length;i++)
        {
            TRIE.insert(word[i]);
        }
        System.out.println(TRIE.search("the"));
        System.out.println(TRIE.search("th"));
    }
}