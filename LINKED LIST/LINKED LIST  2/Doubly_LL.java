class doubly
{
    public static node head;
    public static node tail;
    public static int size;
    public static class node
    {
        int data;
        node next;
        node prev;
        public node (int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    // add first doubly LL
    public void addf(int data)
    {
        node newnode=new node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        
        head=newnode;

    }
    // remove first doubly LL
    public int removefirst()
    {
        if(head==null)
        {
            System.out.println("empty");
            return Integer.MIN_VALUE;

        }
        if(size==1)
        {
            int val =head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;

    }
    // add last Doubly LL
    public void addlast(int data)
    {
        node newnode=new node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
        tail.next=null;
    }
    // remove last doubly LL
    public void removelast()
    {
        if(head==null)
        {
            System.out.println("empty");
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }
    // print 
    public void print()
    {
       
        node temp =head;
        while (temp!=null) 
        {
            System.out.print(temp.data+"<-->");
            temp=temp.next;         
        }
        System.out.println();
    }
    // reverse DOUBLY LINKED LIST
    public void reverse()
    {
        node curr=head;
        node prev=null;
        node next;
        while(curr!=null)
        {
            next =curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;

        }
        head=prev;
        
    }
}
class doublyy
{
    public static void main(String[] args) {
        
        doubly d=new doubly();
        d.addf(5);
        d.addf(6);
        d.addf(7);
        d.addf(8);
        d.addf(9);
        d.print();
        d.removefirst();
        d.print();
        d.addlast(3);
        d.addlast(9);
        d.addlast(2);
        d.print();
        d.removelast();
        d.print();
        d.reverse();
        d.print();

    }
}