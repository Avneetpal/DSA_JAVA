class words
{
    static class Node
    {
        Node  childer[]=new Node[26];
        boolean eow=false;
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
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
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
    public static boolean wordbreak(String key)
    {
        if(key.length()==0)
        {
            return true; 
        }
        for(int i=1;i<=key.length();i++)
        {
            if(search(key.substring(0, i))&& wordbreak(key.substring(i)))
            {
                return true;
            }
        }
        return false;
    }
}
public class word_break 
{
 
    public static void main(String[] args) {
        String word[]={"i","like","sam","samsung"};
        String key="iliksamsung";
        for(int i=0;i<word.length;i++)
        {
            words.insert(word[i]);
        }
        System.out.println(words.wordbreak(key));
    }
}
