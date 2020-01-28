import java.util.Scanner;

public class LinkedListReverseInGroups {

	 Node head;
	public static class Node {
		int data;
		Node next;
		Node(int temp) {
			data = temp;
			next = null;
		}
	}

	public static LinkedListReverseInGroups insert(LinkedListReverseInGroups li, int elem) {
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

	public static void display(LinkedListReverseInGroups li) {
		Node temp1 = li.head;
		System.out.println("Elements of the linked list are: ");
		while(temp1 != null) {
			System.out.println(temp1.data);
			temp1 = temp1.next;
		}
	}

	public static LinkedListReverseInGroups reverseInGroups(LinkedListReverseInGroups li, int num) {
		li.head=reverseInGroups(li.head,num);
		return li;
	}
	 public static Node reverseInGroups(Node head, int num) {
	 	int count = 0;
		Node temp = head;
		Node next = null;
		Node prev = null;
		while(temp != null && count < num ) {
			next = temp.next; 
	        temp.next = prev; 
	        prev = temp; 
	        temp = next; 
	        count++; 
	    } 
	  
	    if (next != null) { 
	        head.next = reverseInGroups(next, num); 
	    }

	    return prev; 
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		LinkedListReverseInGroups li = new LinkedListReverseInGroups();
		System.out.print("Enter the no. of elements: ");
		int n = s.nextInt();
		int elem;
		for(int i = 0; i < n; i++) {
			elem = s.nextInt();
			li.insert(li,elem);
		}
		li.display(li);
		System.out.println("Elements of the number:  ");
		int num = s.nextInt();
		li.reverseInGroups(li,num);
		li.display(li);
		s.close();
	}
}