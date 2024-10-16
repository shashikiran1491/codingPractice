/**
 *
 * The given linked list is 1->2->1->1->2->1 ,
 * which is a palindrome and Hence, the output is true.
 *
 *  1->2->1->2->1
 * which is a palindrome and Hence, the output is true.
 *
 */


public class PalindromeLinkedList {

    Node head;

    public static void main(String[] args) {

        PalindromeLinkedList list = new PalindromeLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(1);
        list.insert(2);
        list.insert(1);
        list.insert(3);

        System.out.println(list.checkForPalindrome());
    }


    public boolean checkForPalindrome () {

        if(head == null) {
           return false;
        }

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

        }
            //now slow is at middle index

            Node prev = null;
            Node curr = slow;

            while (curr != null) {
                Node tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }

            Node n = head;

            while (prev != null) {
                if (n.data != prev.data) {
                    return false;
                }
                n = n.next;
                prev = prev.next;
            }


        return true;
    }


    public Node reverseLinkedList(Node head){

        Node prev = null;
        Node curr = head;

        while(curr != null) {

            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
    }

    public int length() {
        if(head == null) {
            return 0;
        }

        int length = 0;
        Node n = head;

        while(n.next != null){
            length++;
            n = n.next;
        }
        return length+1;
    }

    public void insert(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node n = head;

            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

}
