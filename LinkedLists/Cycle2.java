package LinkedLists;

//Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

//Floyd cycle detection uses two pointers moving at different speeds. Slow pointer moves one step, while fast pointer moves two steps. A cycle forces both pointers to meet inside the cycle; an acyclic list lets fast pointer reach null.
//After the first meeting, reset slow pointer to head and keep fast pointer at the meeting node. Move both pointers one step at a time. The meeting node in the second phase is the cycle entry, based on equal distance from head to entry and from meeting point to entry modulo cycle length.

public class Cycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            // slow = slow.next;
            // fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    // slow = slow.next;
                    // fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
