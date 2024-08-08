class Zigzag {
    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.next = null;
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    public void addf(int data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = tail = newnNode;
            return;
        }
        newnNode.next = head;
        head = newnNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void zig() {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle of the list
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Step 2: Reverse the second half of the list
        Node curr = mid.next;
        mid.next = null; // Split the list into two halves
        Node prev = null;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node secondHalf = prev; // prev is now the head of the reversed second half

        // Step 3: Merge the two halves in a zigzag pattern
        Node firstHalf = head;
        Node temp1, temp2;
        while (secondHalf != null) {
            temp1 = firstHalf.next;
            temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
    }
}

public class Zig_zag_LL {
    public static void main(String[] args) {
        Zigzag l = new Zigzag();
     
        l.addf(1);
        l.addf(2);
        l.addf(3);
        l.addf(4);
        l.addf(5);
        l.print();   // Output before zigzag: 5 4 3 2 1
        l.zig();
        l.print();   // Output after zigzag: 5 1 4 2 3
    }
}
