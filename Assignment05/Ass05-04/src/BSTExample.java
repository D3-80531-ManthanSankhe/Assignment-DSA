class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}





public class BSTExample {
    public static void main(String[] args) {
        BST bst = new BST();

        // Adding nodes to the BST
        bst.addNode(10);
        bst.addNode(5);
        bst.addNode(15);
        bst.addNode(3);
        bst.addNode(7);

        // Perform operations on the BST as needed
        // ...
    }
}
