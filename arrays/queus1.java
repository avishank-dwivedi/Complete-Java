package arrays;
/* 
public class queus1 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Declare head and tail for the queue
    static Node head = null;
    static Node tail = null;

    // Check if the queue is empty
    public static boolean isEmpty() {
        return head == null && tail == null;
    }

    // Add element to the queue
    public static void add(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Remove element from the queue
    public static int remove() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        int front = head.data;
        if (head == tail) {
            tail = null;
        }
        head = head.next;
        return front;
    }

    // Peek the front element of the queue
    public static int peek() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        queus1 q = new queus1(); // Correct class name and no argument in constructor
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

import java.util.*;
public class queus1 {

    

    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q =new LinkedList<>();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/

// using 2 stack to create queue



import java.util.Stack;

public class queus1 {

    static class Queuey {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // Check if the queue is empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // Add element to the queue
        public static void add(int data) {
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Push the new element to s1
            s1.push(data);

            // Move all elements back to s1 from s2
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove element from the queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return s1.pop();
        }

        // Peek the front element of the queue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queuey q = new Queuey();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

