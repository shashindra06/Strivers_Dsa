package LinkedLists;

//Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

class Palindrome {
    public boolean isPalindrome(ListNode head) {
        StringBuilder s = new StringBuilder("");
        while (head != null) {
            // s.append(head.val);
            // head = head.next;
        }
        String original = s.toString();
        String reverse = s.reverse().toString();
        if (original.equals(reverse))
            return true;
        return false;
    }
}

// class Solution {
// // Function to check palindrome using stack.
// public boolean isPalindrome(ListNode head) {
// Stack<Integer> values = new Stack<>();
// ListNode current = head;

// // Store all node values in the stack.
// while (current != null) {
// values.push(current.data);
// current = current.next;
// }

// current = head;

// // Compare with values in reverse order.
// while (current != null) {
// if (current.data != values.peek()) {
// return false;
// }

// values.pop();
// current = current.next;
// }

// return true;
// }
// }

// class Solution {
// // Function to reverse linked list links.
// private ListNode reverseList(ListNode head) {
// ListNode previous = null;
// ListNode current = head;
// // Reverse links one by one.
// while (current != null) {
// ListNode front = current.next;
// current.next = previous;
// previous = current;
// current = front;
// }
// return previous;
// }

// // Function to check palindrome using second half reversal.
// public boolean isPalindrome(ListNode head) {
// if (head == null || head.next == null) return true;
// ListNode slow = head;
// ListNode fast = head;
// // Move slow to middle node.
// while (fast.next != null && fast.next.next != null) {
// slow = slow.next;
// fast = fast.next.next;
// }
// ListNode secondHead = reverseList(slow.next);
// ListNode first = head;
// ListNode second = secondHead;
// // Compare first half and reversed second half.
// while (second != null) {
// if (first.val != second.val) {
// slow.next = reverseList(secondHead);
// return false;
// }
// first = first.next;
// second = second.next;
// }
// slow.next = reverseList(secondHead);
// return true;
// }
// }