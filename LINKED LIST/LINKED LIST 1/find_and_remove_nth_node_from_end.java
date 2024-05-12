class find 
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
            System.out.print(""+temp.data);
            temp= temp.next;
        }
        System.out.println();
    }
    public void remove(int key)
    {
        int size=0;
        node temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        if(size==key)
        {
            head=head.next;
            return;
        }
        node prev=head;
        int index=size-key;
        int i=1;
        while (i<index) 
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

    }
   
}



public class find_and_remove_nth_node_from_end {
    public static void main(String[] args) {
      find f=new find();
      f.addf(5);
      f.addf(4);
      f.addf(3);
      f.addf(2);
      f.addf(1);
      f.print();
      f.remove(3);
      f.print();

    }
    
}
