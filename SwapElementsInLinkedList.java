import java.util.Scanner;

public class  SwapElementsInLinkedList  {
	Node head;
	public static class Node {
		int data;
		Node next;
		Node(int temp) {
			data = temp;
			next = null;
		}
	}

	public static SwapElementsInLinkedList insert(SwapElementsInLinkedList li, int elem) {
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

	public static void display(SwapElementsInLinkedList li) {
		Node temp1 = li.head;
		System.out.println("Elements of the linked list are: ");
		while(temp1.next != null) {
			System.out.print(temp1.data + "->");
			temp1 = temp1.next;
		}
		System.out.print(temp1.data + "->NULL");
	}

	public static SwapElementsInLinkedList swapElements(SwapElementsInLinkedList li) {
		Node temp = li.head;
		int n = 0;
		while(temp != null) {
			n++;
			temp = temp.next;
		}
		int ar[] = new int[n];
		temp = li.head;
		for(int i = 0; i < n; i++) {
			ar[i] = temp.data;
			temp = temp.next;
		}
		for(int i = 0; i < n;i = i+2) {
			if(i % 2 == 0 && i+1 < n) {
				int t = ar[i];
				ar[i] = ar[i+1];
				ar[i+1] = t;
			}
		}

		SwapElementsInLinkedList l1 = new SwapElementsInLinkedList();
		for(int i = 0; i < n; i++) {
			l1.insert(l1, ar[i]);
		}


		return l1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		SwapElementsInLinkedList li = new SwapElementsInLinkedList();
		System.out.print("Enter the no. of elements: ");
		int n = s.nextInt();
		System.out.println("Enter the elements: ");
		for(int i = 0; i < n; i++) {
			li.insert(li, s.nextInt());
		}
		// li.display(li);

		li = li.swapElements(li);

		li.display(li);
	}
}