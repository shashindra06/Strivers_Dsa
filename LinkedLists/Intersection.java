package LinkedLists;

// Given the heads of two singly linked-lists headA and headB, return the node
// at which the two lists intersect. If the two linked lists have no
// intersection at all, return null.

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

// class Solution {

// // Find the first common node using a hash set.
// public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

// // Store references of all nodes from the first list,
// // allowing constant average-time reference checks.
// HashSet<ListNode> visited = new HashSet<>();

// // Traverse the first linked list and store each node reference.
// ListNode first = headA;

// while (first != null) {
// visited.add(first);
// first = first.next;
// }

// // Traverse the second list and check whether each node
// // reference is already present in the first list.
// ListNode second = headB;

// while (second != null) {

// // The first node found in the set is the intersection node.
// if (visited.contains(second)) {
// return second;
// }

// second = second.next;
// }

// // No common node exists between the two lists.
// return null;
// }
// }