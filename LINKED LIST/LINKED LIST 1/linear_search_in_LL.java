

class linear 
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
    public boolean linearsearh(int no)
    {
        if(head==null)
        {
            System.out.println("empty");
            return false;
        }
        node temp=head;
        int index=0;
        while (temp!=null) 
        {
            if(temp.data==no)
            {
                System.out.println("   "+index);
                return true;
            }
            index++;
            temp=temp.next;
            
        }
        return false;
    }
}
class linearsearh
{
    public static void main(String[] args) {
        linear l=new linear();
        l.addf(5);
        l.addf(4);
        l.addf(3);
        l.addf(2);
        l.addf(1);
        l.addf(0);
        System.out.println(l.linearsearh(2));
    }
}