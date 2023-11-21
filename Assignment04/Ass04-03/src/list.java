class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.setHead(null);
    }

    // Insert a new node after a given node
    public void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Insert a new node before a given node
    public void insertBefore(Node nextNode, int newData) {
        if (nextNode == null) {
            System.out.println("Next node cannot be null.");
            return;
        }

        Node newNode = new Node(newData);
        
        if (getHead() == null) {
            // If the list is empty, set the new node as the head
            setHead(newNode);
            return;
        }

        if (getHead() == nextNode) {
            // If the nextNode is the head, insert before the head
            newNode.next = getHead();
            setHead(newNode);
            return;
        }

        // Traverse the list to find the node before the nextNode
        Node current = getHead();
        while (current.next != null && current.next != nextNode) {
            current = current.next;
        }

        if (current.next == null) {
            // nextNode was not found in the list
            System.out.println("Given node not found in the list.");
        } else {
            newNode.next = nextNode;
            current.next = newNode;
        }
    }

    // Display the elements of the list
    public void display() {
        Node current = getHead();
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
}

public class list {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.insertAfter(null, 1); // Should print an error message
        linkedList.insertBefore(null, 2); // Should print an error message

        linkedList.display();

        linkedList.insertAfter(linkedList.getHead(), 3);
        linkedList.insertAfter(linkedList.getHead(), 5);
        linkedList.insertBefore(linkedList.getHead().next, 4);
        linkedList.insertBefore(linkedList.getHead(), 2);

        System.out.println("List after insertions:");
        linkedList.display();
    }
}
