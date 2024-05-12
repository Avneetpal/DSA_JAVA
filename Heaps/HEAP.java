import java.util.*;
class Heap 
{
    static class heap 
    {
        ArrayList<Integer> arr=new ArrayList<>();
        // insert in a heap
        public  void insert(int data)
        {
            arr.add(data);
            int x=arr.size()-1;// child index
            int par=(x-1)/2; // parent index
            while (arr.get(x)<arr.get(par)) 
            {
                // swap
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
        private void heapify(int i)
        {
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if(left<arr.size()&& arr.get(minidx)>arr.get(left))
            {
                minidx=left;
            }
            if(right<arr.size()&& arr.get(minidx)>arr.get(right))
            {
                minidx=right;
            }
            if(minidx!=i)
            {
                int temp=arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);
                heapify(minidx);
            }
        }
        public int remove()
        {
            int data=arr.get(0);
            // swap
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            // remove
            arr.remove(arr.size()-1);
            // hepify
            heapify(0);
            return data;

        }
        public boolean isempty()
        {
            return arr.size()==0;
        }
    }
}


public class HEAP {
    public static void main(String[] args) {
        Heap .heap h=new Heap.heap();
        h.insert(3);
        h.insert(1);
        h.insert(4);
        h.insert(5);
        while (!h.isempty()) 
        {
            System.out.println(h.peek());
            h.remove();
          
            
        }
        
    }
    
}
