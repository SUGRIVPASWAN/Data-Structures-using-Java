import java.util.Scanner;

class Node {
	char key;
	Node left,right;
	Node(char temp) {
		key = temp;
		left = right = null;
	}
}

public class TernaryToBinaryTree {
	  

	public static Node insert(char[] exp, int i) 
    { 
        
        if (i >= exp.length) {
            return null; 
        }
     
        Node root = new Node(exp[i]); 
       
        ++i; 

        if (i < exp.length && exp[i]=='?') {
            root.left = insert(exp, i+1); 
        }
       
        else if (i < exp.length) {
            root.right = insert(exp, i+1); 
        }
       
        return root; 
    } 


	public void printTree( Node root) 
    { 
        if (root == null) {
            return; 
        }
                  
        System.out.print(root.key +" "); 
        printTree(root.left); 
        printTree(root.right); 
    } 

	public static void main(String args[])  
    { 
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String s = sc.next();
        TernaryToBinaryTree tree = new TernaryToBinaryTree(); 
        char[] exp=s.toCharArray();  
        Node root = tree.insert(exp, 0); 
        tree.printTree(root) ; 
    } 
}