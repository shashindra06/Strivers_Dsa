package StacksQueues;

import java.util.ArrayDeque;
import java.util.Deque;

class Queue_using_stacks {
    private Deque<Integer> s1;
    private Deque<Integer> s2;

    public void MyQueue() {
        s1 = new ArrayDeque<>();
        s2 = new ArrayDeque<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        int n = s1.size() - 1;
        for (int i = 0; i < n; i++) {
            s2.push(s1.pop());
        }
        int result = s1.pop();
        for (int i = 0; i < n; i++) {
            s1.push(s2.pop());
        }
        return result;
    }

    public int peek() {
        int n = s1.size() - 1;
        for (int i = 0; i < n; i++) {
            s2.push(s1.pop());
        }
        int result = s1.peek();
        for (int i = 0; i < n; i++) {
            s1.push(s2.pop());
        }
        return result;
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
