import java.util.Scanner;
public class MinimumElementInStack {

	Node top;
	public static class Node {
		int data;
		Node next;
		Node(int temp) {
			this.data = temp;
			this.next = null;
		}
	}

	public static MinimumElementInStack insert(MinimumElementInStack st, int temp) {
		Node newNode = new Node(temp);
		if(newNode == null) {
			System.out.println("Stack overflow!!");
		}
		else {
			newNode.next = st.top;
			st.top = newNode;
		}
		return st;
	}

	public static void display(MinimumElementInStack st) {
		if(st.top == null) {
			System.out.println("Stack Underflow!!");
		}
		else {
			Node temp = st.top;
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}

	}

	public static void minimumElement(MinimumElementInStack st) {
		Node temp = st.top;
		int min = temp.data;
		while(temp != null ){
			if(temp.data < min) {
				min = temp.data;
			}
			temp = temp.next;
		}
		System.out.print("Minimum element in the Stack is: " + min);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of elements in Stack: ");
		int n = sc.nextInt();
		MinimumElementInStack st = new MinimumElementInStack();
		for(int i = 0; i < n; i++) {
			st.insert(st, sc.nextInt());
		}
		System.out.println("elements of the stack are: ");
		st.display(st);
		st.minimumElement(st);

	}
}