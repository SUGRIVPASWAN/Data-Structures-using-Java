import java.util.Scanner;
import java.lang.Math;
public class SumOfTwoNumbersLinkedList {

	Node head;
	public static class Node {
		int data;
		Node next;
		Node(int temp) {
			data = temp;
			next = null;
		}
	}

	public static SumOfTwoNumbersLinkedList insert(SumOfTwoNumbersLinkedList li, int elem) {
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

	public static SumOfTwoNumbersLinkedList findSum(SumOfTwoNumbersLinkedList l1, SumOfTwoNumbersLinkedList l2) {
		int n1 = 0;
		int n2 = 0;
		int num1 = 0;
		int num2 = 0;
		int sum;
		Node temp = l1.head;
		while(temp != null) {
			n1++;
			temp = temp.next;
		}
		temp = l1.head;
		n1--;
		while(temp != null) {
			num1+= Math.pow(10,n1) * temp.data; 
			temp = temp.next;
			n1--;

		}

		temp = l2.head;
		while(temp != null) {
			n2++;
			temp = temp.next;
		}
		n2--;
		temp = l2.head;
		while(temp != null) {
			num2+= Math.pow(10,n2) * temp.data; 
			temp = temp.next;
			n2--;
		}
		
		sum = num1 + num2;
		int s1;
		SumOfTwoNumbersLinkedList l3 = new SumOfTwoNumbersLinkedList();
		while(sum > 0) {
			s1 = sum % 10;
			sum =sum /10;
			l3.insert(l3,s1);
		}

		return l3;

	}

	public static void display(SumOfTwoNumbersLinkedList li) {
		Node temp1 = li.head;
		System.out.println("Elements of the linked list are: ");
		while(temp1 != null) {
			System.out.print(temp1.data + " ");
			temp1 = temp1.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of test cases: ");
		int t = sc.nextInt();
		for (int j = 0; j < t; j++) {
			SumOfTwoNumbersLinkedList l1 = new SumOfTwoNumbersLinkedList();
			SumOfTwoNumbersLinkedList l2 = new SumOfTwoNumbersLinkedList();

			System.out.println("Enter the length of 1st Linked list: ");
			int n1 = sc.nextInt();
			System.out.println("Enter the " + n1 + " Elements");
			for(int i = 0; i < n1; i++) {
				l1.insert(l1, sc.nextInt());
			}

			System.out.println("Enter the length of 2nd Linked list: ");
			int n2 = sc.nextInt();
			System.out.println("Enter the " + n2 + " Elements");
			for(int i = 0; i < n2; i++) {
				l2.insert(l2, sc.nextInt());
			}

			SumOfTwoNumbersLinkedList l3 = findSum(l1,l2);
			l3.display(l3);

		}
		sc.close();
	}

}
