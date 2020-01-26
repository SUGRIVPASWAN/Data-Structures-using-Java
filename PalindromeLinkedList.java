import java.util.Scanner;
public class PalindromeLinkedList {
	 Node head;
	public static class Node {
		int data;
		Node next;
		Node(int temp) {
			data = temp;
			next = null;
		}
	}

	public static PalindromeLinkedList insert(PalindromeLinkedList li, int elem) {
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

	public static void display(PalindromeLinkedList li) {
		Node temp1 = li.head;
		System.out.println("Elements of the linked list are: ");
		while(temp1 != null) {
			System.out.println(temp1.data);
			temp1 = temp1.next;
		}
	}

	public static void palindrome(PalindromeLinkedList li) {
		Node temp = li.head;
		int n=0;
		while(temp != null) {
			n++;
			temp=temp.next;
		}
		int arr[]=new int[n];
		temp = li.head;
		int i=0;
		while(temp != null) {
			arr[i] = temp.data;
			i++;
			temp=temp.next;
		}
		temp =li.head;
		for(int j=n-1;j>=0;j--) {
			if(temp.data == arr[j]) {
				temp=temp.next;
			}
			else {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");

	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		PalindromeLinkedList li = new PalindromeLinkedList();
		System.out.print("Enter the no. of elements: ");
		int n = s.nextInt();
		int elem;
		for(int i = 0; i < n; i++) {
			elem = s.nextInt();
			li.insert(li,elem);
		}
		li.display(li);
		palindrome(li);
		s.close();
	}

}