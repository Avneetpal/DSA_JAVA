class  longest 
{
    static class Node
    {
        Node childern[]=new Node[26];
        boolean eow=false;
        Node()
        {
            for(int i=0;i<26;i++)
            {
                childern[i]=null;

            }
        }
    }
    static Node root=new Node();
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
    public static String ans="";
    public static void longests(Node root,StringBuilder temp)
    {
        if(root==null)
        {
            return;
        }
        for(int i=0;i<26;i++)
        {
            if(root.childern[i]!=null && root.childern[i].eow==true)
            {
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length()>ans.length())
                {
                    ans=temp.toString();
                }
                longests(root.childern[i], temp);
                temp.deleteCharAt(temp.length()-1);// backtracking step
                
            }
       
        }
    }
}
public class Longest_word_with_all_prefix {
    public static void main(String[] args) {
        
        String word[]={"a","banana","app","ap","appl","apply","apple"};
        for(int i=0;i<word.length;i++)
        {
            longest.insert(word[i]);
        }
        longest.longests(longest.root, new StringBuilder(""));
        System.out.println(longest.ans);
    }
    
}
