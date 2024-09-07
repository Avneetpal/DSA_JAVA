import java.util.*;
class Insert 
{
    static class insert 
    {
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data )
        {
            arr.add(data);
            int x=arr.size()-1;// child index
            int par=(x-1)/2; // parent index
            while (arr.get(x)<arr.get(par)) 
            {
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x=par;
                par=(x-1)/2;
                
            }
           

        }
        public int peek()
        {
            return arr.get(0);
        }
        public void heapify(int i)
        {
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if(left<arr.size() && arr.get(minidx)>arr.get(left))
            {
                minidx=left;
            }
            if(right<arr.size() && arr.get(minidx)> arr.get(right))
            {
                minidx=right;
            }
            if(minidx!=i)
            {
                int temp=arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);
                heapify(minidx);
            }
        }
        public int remove()
        {
            int data=arr.get(0);
            // swap 1 and last idx
            int temp=arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            // remove last elemet
            arr.remove(arr.size()-1);
            // heapify
            heapify(0);
            return data;
        
    }
    public boolean isEmpty()
    {
        return arr.size()==0;
    }
}
}

public class insert_in_heap 
{
    public static void main(String[] args) {
        Insert.insert i=new Insert.insert();
        i.add(5);
        i.add(9);
        i.add(7);
        i.add(1);
        while (!i.isEmpty()) 
        {
            System.out.println(i.peek());
            i.remove();
            
        }
        
    }
    
}
