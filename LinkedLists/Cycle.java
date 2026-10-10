package LinkedLists;

//Given head, the head of a linked list, determine if the linked list has a cycle in it.

public class Cycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            // fast = fast.next.next;
            // slow = slow.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}

// public class Solution {
// public boolean hasCycle(ListNode head) {
// HashSet<ListNode> visited = new HashSet<>();
// while(head != null) {
// if(visited.contains(head)) return true;
// visited.add(head);
// head = head.next;
// }
// return false;
// }
// }