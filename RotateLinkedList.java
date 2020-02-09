import java.util.Scanner;

public class RotateLinkedList {

	Node head;
	public static class Node {
		int data;
		Node next;
		Node(int temp) {
			data = temp;
			next = null;
		}
	}

	public static RotateLinkedList insert(RotateLinkedList li, int elem) {
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

	public static RotateLinkedList rotate(RotateLinkedList li, int k) {
		RotateLinkedList l1 = new RotateLinkedList();
		Node temp1 = li.head;
		int n = 0;
		while(temp1 != null) {
			n++;
			temp1 = temp1.next;
		}
		int ar[] = new int[n];
		temp1 = li.head;
		for(int i = 0; i < n; i++ ) {
			ar[i] = temp1.data;
			temp1 = temp1.next;
		}
		for(int j = 0; j < k; j++) {
			int t = ar[0];
			for(int i = 0; i < n-1; i++) {
				ar[i] = ar[i+1];
			}
			ar[ar.length - 1] = t;
		}
		for(int i = 0; i < n; i++ ) {
			l1.insert(l1, ar[i]);
		}
		
		return l1;
	}

	public static void display(RotateLinkedList li) {
		Node temp1 = li.head;
		
		while(temp1 != null) {
			System.out.println(temp1.data);
			temp1 = temp1.next;
		}
	}	

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		RotateLinkedList li = new RotateLinkedList();
		System.out.print("Enter the no. of elements: ");
		int n = s.nextInt();
		System.out.println("Enter the elements: ");
		for(int i = 0; i < n; i++) {
			li.insert(li, s.nextInt());
		}
		System.out.print("Enter the rotations to be done: ");
		int k = s.nextInt();
		System.out.println("Elements of the linked list are: ");
		li.display(li);
		li = li.rotate(li, k);
		System.out.println("Elements of the rotated linked list are: ");
		li.display(li);
		s.close();
	}
}