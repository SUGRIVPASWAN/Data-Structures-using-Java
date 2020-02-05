import java.util.Scanner;

public class PhoneBookUsingLinkedList {

	Node head;
	public static class Node {
		String name;
		int number;
		Node next;
		Node(String s, int n) {
			name = s;
			number = n;
			next = null;
		}
	}

	public static PhoneBookUsingLinkedList insert(PhoneBookUsingLinkedList pb, String s, int n) {
		Node newNode = new Node(s, n);
		if(pb.head == null) {
			pb.head = newNode;
		}
		else {
			Node temp1 = pb.head;
			while(temp1.next != null) {
				temp1 = temp1.next;
			}
			temp1.next = newNode;
		}
		return pb;
	}

	public static void findNumber(PhoneBookUsingLinkedList pb, String qs) {
		Node temp = pb.head;
		while (temp != null) {
			if(temp.name.equals(qs)) {
				System.out.println(temp.name + " = " + temp.number);
				return;
			}

			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Query not found !!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of entries in the PhoneBook: ");
		int n = sc.nextInt();
		PhoneBookUsingLinkedList pb = new PhoneBookUsingLinkedList();
		for(int i = 0; i < n; i++) {
			System.out.print("Enter th name: ");
			String name = sc.next();
			System.out.print("Enter the number: ");
			int number = sc.nextInt();
			pb.insert(pb, name, number);
			System.out.println();
		}

		System.out.print("Enter the no. of queries: ");
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			System.out.print("Enter the query: ");
			String qs = sc.next();
			findNumber(pb, qs);
		}

		sc.close();
	}
}