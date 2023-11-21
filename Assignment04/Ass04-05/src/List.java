

  
public class List {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	Node head;
	public List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void add(int value) {
		Node newnode = new Node(value);
		if (head == null || value < head.data) {
            newnode.next = head;
            head = newnode;
            return;
        }
		
		Node temp = head;
		
		while(temp.next != null && temp.next.data<value) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
		
	}
	public void display() {
		Node temp = head;
		while(temp != null ) {
			 System.out.println(temp.data + " ");
         temp  = temp.next;
		}
	}
	
	public static void main(String[] args) {
		List list = new List();
		list.add(4);
		list.add(3);
		list.add(20);
		
		list.display();
	}
}

