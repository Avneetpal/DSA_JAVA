
class recursive 
{
    public static node head;
    public static node tail;
    public static class node 
    {
        int data;
        node next;
        public node(int data)
        {
            this.data=data;
            this.next=null;

        }
    }
    public void addf(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("empty");
            return;

        }
        node temp=head;
        while (temp!=null) 
        {
            System.out.println(""+temp.data);
            temp= temp.next;
        }
    }
    public int helper(int key,node head)
    {
        if(head==null)
        {

            return -1;
        }
        if(head.data==key)
        {
            System.out.println("found");
            return 0;
        }
        int index=helper(key, head.next);
        if(index==-1)
        {
            System.out.println("not found");
        }
        return index+1;
    }
    public int recursion(int key)
    {
        return helper(key, head);
    }
  
}
public class recursive_search_in_LL {
    public static void main(String[] args) {
       recursive l=new recursive();
       l.addf(5);
        l.addf(4);
        l.addf(3);
        l.addf(2);
        l.addf(1);
        l.addf(0);
        l.print();
       System.out.println(l.recursion(2));
     
    
}
}
