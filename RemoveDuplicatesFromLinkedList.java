import java.util.Scanner;
public class RemoveDuplicatesFromLinkedList {
	 Node head;
	public static class Node {
		int data;
		Node next;
		Node(int temp) {
			data = temp;
			next = null;
		}
	}

	public static RemoveDuplicatesFromLinkedList insert(RemoveDuplicatesFromLinkedList li, int elem) {
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

	public static void display(RemoveDuplicatesFromLinkedList li) {
		Node temp1 = li.head;
		System.out.println("Elements of the linked list are: ");
		while(temp1 != null) {
			System.out.println(temp1.data);
			temp1 = temp1.next;
		}
	}

	public static RemoveDuplicatesFromLinkedList RemoveDuplicates(RemoveDuplicatesFromLinkedList li) {
        Node curr = li.head;
        while(curr != null) {
            Node temp = curr;
            
            while(temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
           
            curr.next = temp;
            curr = curr.next;
        }
    	return li;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		RemoveDuplicatesFromLinkedList li = new RemoveDuplicatesFromLinkedList();
		System.out.print("Enter the no. of elements: ");
		int n = s.nextInt();
		int elem;
		for(int i = 0; i < n; i++) {
			elem = s.nextInt();
			li.insert(li,elem);
		}
		li.display(li);
		RemoveDuplicates(li);
		li.display(li);
		s.close();
	}
}