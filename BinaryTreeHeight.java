
class Node {
	int key;
	Node left,right;
	Node(int temp) {
		key = temp;
		left = right = null;
	}
}

public class BinaryTreeHeight {
	Node root;
	BinaryTreeHeight() {
		root = null;
	}
	BinaryTreeHeight(int temp) {
		root = new Node(temp);
	}

	static void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.println(root.key);
			inOrder(root.right);
		}
		return;
	}

	static int height(Node root) {
		if(root == null) {
			return 0;
		}
		else {
			int l = height(root.left);
			int r = height(root.right);

			if(l > r) {
				return l + 1;
			}
			else {
				return r + 1;
			}
		}
	}

	public static void main(String[] args) {
		BinaryTreeHeight tree = new BinaryTreeHeight();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("\nInorder of the tree is: ");
		inOrder(tree.root);
		int h = height(tree.root);
		System.out.println("\nHeight of the tree is: "+h);
	}
}