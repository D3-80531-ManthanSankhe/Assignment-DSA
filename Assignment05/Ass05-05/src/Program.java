

public class Program {

	public static void main(String[] args) {
		BST bst = new BST();
		bst.addNode(5);
		bst.addNode(8);
		bst.addNode(10);
		bst.addNode(9);
		bst.addNode(4);
		bst.addNode(2);
		bst.BFSTraversal();
		if(bst.binary(800)!=null) {
			System.out.println("The key is found");
		}
		else
			System.out.println("Key is not found");
	}
	

}