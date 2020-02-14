import java.util.Scanner;
import java.lang.Math;

class Node {
	int data;
	Node left,right;
	Node(int temp) {
		data = temp;
		left = right = null;
	}
}
public class DiameterOfBinaryTree {
	Node root;
	DiameterOfBinaryTree() {
		root = null;
	}
	DiameterOfBinaryTree(int temp) {
		root = new Node(temp);
	}

	public static int diameter(Node node)
    {
        
        if (node == null) {
            return 0; 
        }
  
        int lheight = height(node.left); 
        int rheight = height(node.right); 
  
        int ldiameter = diameter(node.left); 
        int rdiameter = diameter(node.right); 
  
        return Math.max(lheight + rheight + 1,Math.max(ldiameter, rdiameter)); 
  
    }

	public static int height(Node root) {
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
		DiameterOfBinaryTree tree = new DiameterOfBinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.right.right = new Node(60);
		int d = diameter(tree.root);
		System.out.println("\nDiameter of the tree is: "+d);
		
	}
}