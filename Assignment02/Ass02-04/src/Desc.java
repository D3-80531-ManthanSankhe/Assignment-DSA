
public class Desc {
	private int size;
	private int arr[];
	private int top;
	
	public Desc(int size) {
		this.size = size;
		top=size;
		arr = new int[size];
	}
	public boolean isFull() {
		return top == 0;
	}
	public boolean isEmpty() {
		return top== size;
	}
	public void push(int value) {
		top--;
		arr[top] = value;
	}
	public void pop() {
		top++;
	}
	public int peek() {
		return arr[top];
	}
	
	

}
