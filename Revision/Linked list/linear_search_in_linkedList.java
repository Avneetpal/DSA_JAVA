class Linkedlis
{
    public static class Node
    {
       int data;
       Node next;
       Node(int data)
       {
        this.data=data;
        this.next=null;

       }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addf(int data)
    {
        Node newnNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnNode;
            return;
        }
        newnNode.next=head;
        head=newnNode;
        

    }
    public void search(int k)
    {
        Node temp=head;
        
        for(int i=0;i<size-1;i++)
        {
            if(temp.data==k)
            {
                System.out.println("found at index"+i);
                return;
            }
            else
            {
                temp=temp.next;
            }
            

        }
        System.out.println("not found");

    }
}


class search {
    public static void main(String[] args) {
        Linkedlis ll=new Linkedlis();
        ll.addf(1);
        ll.addf(5);
        ll.addf(7);
        ll.addf(6);
        ll.addf(8);
        ll.search(5);
    }
    
}
