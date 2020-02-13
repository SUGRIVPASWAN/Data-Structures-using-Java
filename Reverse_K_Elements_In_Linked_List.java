import java.util.Scanner;

public class Reverse_K_Elements_In_Linked_List {

	Node head;
	public static class Node {
		int data;
		Node next;
		Node(int temp) {
			data = temp;
			next = null;
		}
	}

	public static Reverse_K_Elements_In_Linked_List insert(Reverse_K_Elements_In_Linked_List li, int elem) {
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

	public static void display(Reverse_K_Elements_In_Linked_List li) {
		Node temp1 = li.head;
		System.out.println("Elements of the linked list are: ");
		while(temp1.next != null) {
			System.out.print(temp1.data + "->");
			temp1 = temp1.next;
		}
		System.out.print(temp1.data + "->NULL");
	}

	public static Reverse_K_Elements_In_Linked_List reverse_K_Elements(Reverse_K_Elements_In_Linked_List li, int k) {
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
		int a[] = new int[n];
		int j = 0;
		for(int i = k-1; i >= 0; i--) {
			a[j] = ar[i];
			j++;
		}
		for(int i = k; i < n; i++) {
			a[i] = ar[i];
		}

		Reverse_K_Elements_In_Linked_List l1 = new Reverse_K_Elements_In_Linked_List();
		for(int i = 0; i < n; i++) {
			l1.insert(l1, a[i]);
		}
		return l1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Reverse_K_Elements_In_Linked_List li = new Reverse_K_Elements_In_Linked_List();
		System.out.print("Enter the no. of elements: ");
		int n = s.nextInt();
		System.out.println("Enter the elements: ");
		for(int i = 0; i < n; i++) {
			li.insert(li, s.nextInt());
		}
		// li.display(li);
		System.out.println("Enter the value of K: ");
		int k = s.nextInt(); 
		li = li.reverse_K_Elements(li, k);

		li.display(li);
	}
}