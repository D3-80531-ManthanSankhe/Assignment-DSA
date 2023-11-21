package question4;

public class List {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;
	static int count = 0;

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = newnode;
		else {
			newnode.next = head;
			head = newnode;
		}
		count++;
	}

	public void displayF() {
		Node trav = head;
		System.out.println("THE FORWARD ORDER");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

	
	public void displayR() {
		Node trav = head;
		System.out.println("THE REVERSE ORDER");

		Stack s= new Stack(count);
		System.out.print("List : ");
		while(trav != null) {
			s.push(trav.data);
			trav = trav.next;
		}	
		for(int i=0;i<count;i++) {
			System.out.print(" " + s.pop());
		}
		}

	public void addPosition(int value, int pos) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = newnode;
		else if (pos <= 1) {
			addFirst(value);
			return;
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next != null; i++)
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
		count++;
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = newnode;
		else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newnode;
		}
		count++;
	}

	public void deleteFirst() {
		if (isEmpty())
			return;
		head = head.next;
		count--;
	}

	public void deleteLast() {
		if (isEmpty())
			return;
		else if (head.next == null)
			head = null;
		else {
			Node trav = head;
			while (trav.next.next != null)
				trav = trav.next;
			trav.next = null;
		}
		count--;
	}

	public void deletePosition(int pos) {
		if (isEmpty())
			return;
		else if (pos <= 1) {
			deleteFirst();
			return;
		}
		else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next.next != null; i++)
				trav = trav.next;
			trav.next = trav.next.next;
		}
		count--;
	}

	public void deleteAll() {
		head = null;
	}

}
