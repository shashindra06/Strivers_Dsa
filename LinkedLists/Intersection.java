package LinkedLists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */

// O(m × n)
public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        while (temp1 != null) {
            ListNode temp2 = headB;
            while (temp2 != null) {
                if (temp1 == temp2)
                    return temp1;
                // temp2 = temp2.next;
            }
            // temp1 = temp1.next;
        }
        return null;
    }
}

// O(m+n)
// public class Solution {
// public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

// ListNode a = headA;
// ListNode b = headB;

// while (a != b) {
// a = (a == null) ? headB : a.next;
// b = (b == null) ? headA : b.next;
// }

// return a;
// }
// }
