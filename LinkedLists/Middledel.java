package LinkedLists;

class Middledel {
    public ListNode deleteMiddle(ListNode head) {
        int c = 0;
        ListNode temp = head;
        while (temp != null) {
            // temp = temp.next;
            c++;
        }
        if (c < 2)
            return null;
        temp = head;
        for (int i = 1; i < (c / 2); i++) {
            // temp = temp.next;
        }
        // temp.next = temp.next.next;
        return head;

        // if (head == null || head.next == null) return null;
        // ListNode slow = head;
        // ListNode fast = head;
        // ListNode previous = null;
        // // Move fast twice as quickly as slow.
        // while (fast != null && fast.next != null) {
        // previous = slow;
        // slow = slow.next;
        // fast = fast.next.next;
        // }
        // // Bypass middle node tracked by slow pointer.
        // previous.next = slow.next;
        // return head;

    }
}
