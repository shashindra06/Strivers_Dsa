package LinkedLists;

//Given the head of a linked list, remove the nth node from the end of the list and return its head.

class Nthlastdel {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = 0;
        ListNode temp = head;
        while (temp != null) {
            c++;
            // temp = temp.next;
        }
        int t = c - n;
        // if(t == 0) return head.next;
        temp = head;
        for (int i = 1; i < t; i++) {
            // temp = temp.next;
        }
        // temp.next = temp.next.next;
        return head;
    }
}
