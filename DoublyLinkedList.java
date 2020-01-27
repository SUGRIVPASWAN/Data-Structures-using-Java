import java.util.Scanner;

public class DoublyLinkedList {

    Node head,tail;
	static class Node {

		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
			next = null;
			prev = null;
		}
	}

	public static DoublyLinkedList insert(DoublyLinkedList li, int data) {
		Node temp = new Node(data);
		if(li.head == null) {
			li.head = temp;
			li.tail = temp;
		}
		else {
			li.tail.next = temp;
			temp.prev = li.tail;
			li.tail = temp;
		}
		return li;
	}

	public static void findPairs(DoublyLinkedList li, int sum) {
		Node temp = li.head;
		while(temp != null) {
			int t =temp.data;
			Node temp1 = temp.next;
			while(temp1 != null) {
				if((t+temp1.data) == sum) {
					System.out.print("("+temp1.data+","+t+"),");
					temp1 = temp1.next;
				}
				else {
					temp1 = temp1.next;
				}
			}
			temp = temp.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList li = new DoublyLinkedList();
		li.insert(li,1);
		li.insert(li,2);
		li.insert(li,4);
		li.insert(li,5);
		li.insert(li,6);
		li.insert(li,8);
		li.insert(li,9);
		System.out.println("Enter the sum you want: ");
		int sum = sc.nextInt();
		li.findPairs(li,sum);
		sc.close();
	}
}