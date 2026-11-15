package StacksQueues;

import java.util.ArrayDeque;
import java.util.Queue;

class Stack_using_queues {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public void MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    public void push(int x) {

        if (q1.size() != 0) {
            q1.offer(x);
        } else {
            q2.offer(x);
        }
    }

    public int pop() {

        if (q1.size() != 0) {
            int n = q1.size() - 1;
            for (int i = 0; i < n; i++) {
                q2.offer(q1.poll());
            }

            return q1.poll();
        } else {
            int n = q2.size() - 1;
            for (int i = 0; i < n; i++) {
                q1.offer(q2.poll());
            }

            return q2.poll();
        }
    }

    public int top() {
        if (q1.size() != 0) {
            int n = q1.size() - 1;
            for (int i = 0; i < n; i++) {
                q2.offer(q1.poll());
            }
            q2.offer(q1.peek());
            return q1.poll();
        } else {
            int n = q2.size() - 1;
            for (int i = 0; i < n; i++) {
                q1.offer(q2.poll());
            }
            q1.offer(q2.peek());
            return q2.poll();
        }
    }

    public boolean empty() {
        if (q1.size() != 0 || q2.size() != 0) {
            return false;
        } else {
            return true;
        }
    }
}
