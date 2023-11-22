class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Deque {
    private Node head;
    private Node tail;

    public Deque() {
        this.head = null;
        this.tail = null;
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Add an element to the front of the deque
    public void addFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add an element to the end of the deque
    public void addRear(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Remove and return the element from the front of the deque
    public int removeFront() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }

        int frontData = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            // If the deque becomes empty after removal, update the tail
            tail = null;
        }

        return frontData;
    }

    // Remove and return the element from the end of the deque
    public int removeRear() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }

        int rearData = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            // If the deque becomes empty after removal, update the head
            head = null;
        }

        return rearData;
    }

    // Peek at the element from the front of the deque without removing it
    public int peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        return head.data;
    }

    // Peek at the element from the end of the deque without removing it
    public int peekRear() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        return tail.data;
    }
}

public class DequeExample {
    public static void main(String[] args) {
        Deque deque = new Deque();

        deque.addFront(1);
        deque.addRear(2);
        deque.addFront(3);

        System.out.println("Front element: " + deque.peekFront());
        System.out.println("Rear element: " + deque.peekRear());

        System.out.println("Removed front element: " + deque.removeFront());
        System.out.println("Removed rear element: " + deque.removeRear());

        System.out.println("Is deque empty? " + deque.isEmpty());
    }
}

