import java.util.Scanner;
public class ReverseLinkedList {
	 Node head;
	public static class Node {
		int data;
		Node next;
		Node(int temp) {
			data = temp;
			next = null;
		}
	}

	public static ReverseLinkedList insert(ReverseLinkedList li, int elem) {
		Node newNode = new Node(elem);
		if(li.head == null) {
			li.head = newNode;
			return li;
		}
		else {
			Node temp1 = li.head;
			while(temp1.next != null) {
				temp1 = temp1.next;
			}
			temp1.next = newNode;
			return li;
		}
	}

	public static void display(ReverseLinkedList li) {
		Node temp1 = li.head;
		System.out.println("Elements of the linked list are: ");
		while(temp1 != null) {
			System.out.println(temp1.data);
			temp1 = temp1.next;
		}
	}

	public static void reverseDisplay(Node h1) {
		Node temp1 = h1;
		if(temp1.next != null) {
			reverseDisplay(temp1.next);
			System.out.print(temp1.data);
			if(temp1.next != null){
				System.out.print("->");
			}
		}
		else {
			System.out.print(temp1.data+"->");
		}
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		ReverseLinkedList li = new ReverseLinkedList();
		System.out.print("Enter the no. of elements: ");
		int n = s.nextInt();
		int elem;
		for(int i = 0; i < n; i++) {
			elem = s.nextInt();
			li.insert(li,elem);
		}
		li.display(li);
		System.out.println("Elements of the reversed linked list are: ");
		li.reverseDisplay(li.head);
		System.out.print("Null");
		s.close();
	}
}