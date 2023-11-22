
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
		public int getData() {
			return data;
		}
	}
	
	private Node root;
	public BST() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}


	public void addNode(int val) {
        root = addNodeR(root, val);
    }

   public Node addNodeR( Node root, int val) {
        if (root == null) {
            return new  Node(val);
        }
        if (val < root.data) {
            root.left = addNodeR(root.left, val);
        } else if (val > root.data) {
            root.right = addNodeR(root.right, val);
        }

        return root;
    }
   public Node binary(int key) {
	   return root=binarySearchR(root, key);
   }
   public Node binarySearchR(Node root,int key) {
	   Node trav=root;
	   if (root == null || root.data == key) {
           return root;
       }

       // Key is smaller than the root's key, search in the left subtree
       if (key < root.data) {
           return binarySearchR(root.left, key);
       }

       // Key is larger than the root's key, search in the right subtree
       return binarySearchR(root.right, key);
   }


   public Node binarySearch(int key) {
		Node trav = root;
		while(trav != null) {
			if(key == trav.data)
				return trav;
			else if(key < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		return null;
	}
   
	public void preorder(Node trav) {
		if(trav == null)
			return;
		System.out.print(" " + trav.data);//V 
		preorder(trav.left);//L 
		preorder(trav.right);//R
	}
	
	public void preorder() {
		System.out.print("Preorder: ");
		preorder(root);
		System.out.println("");
	}
	
	public void inorder(Node trav) {
		if(trav == null)
			return;
		inorder(trav.left);//L 
		System.out.print(" " + trav.data);//V 
		inorder(trav.right);//R
	}
	
	public void inorder() {
		System.out.print("Inorder: ");
		inorder(root);
		System.out.println("");
	}
	
	public void postorder(Node trav) {
		if(trav == null)
			return;
		postorder(trav.left);//L 
		postorder(trav.right);//R
		System.out.print(" " + trav.data);//V
	}
	
	public void postorder() {
		System.out.print("Postorder: ");
		postorder(root);
		System.out.println("");
	}
	
	
	
	public void DFSTraversal() {
		Stack<Node> st = new Stack<>();
		st.push(root);
		System.out.print("DFS Traversal : ");
		while(!st.isEmpty()) {
			Node trav = st.pop();
			System.out.print(" " + trav.data);
			if(trav.right != null)
				st.push(trav.right);
			if(trav.left != null)
				st.push(trav.left);
		}
		System.out.println("");
	}
	
	public void BFSTraversal() {
		Queue<Node> q = new LinkedList<BST.Node>();
		q.offer(root);
		System.out.print("BFS Traversal : ");
		while(!q.isEmpty()) {
			Node trav = q.poll();
			System.out.print(" " + trav.data);
			if(trav.left != null)
				q.offer(trav.left);
			if(trav.right != null)
				q.offer(trav.right);
		}
		System.out.println("");
	}
	
	
}