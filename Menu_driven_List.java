package com.in;

import java.util.Scanner;

public class Menu_driven_List {

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static Node head;

	public static Menu_driven_List insert(Menu_driven_List li, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (li.head == null)
			li.head = newNode;
		else {
			Node last = li.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return li;
	}

	public static void display(Menu_driven_List li) {
		Node temp = li.head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void deleteByIndex(Menu_driven_List li, int index) {
		Node current = li.head;
		Node previous = null;

		// case1: index is 0
		if (index == 0 && current != null) {
			li.head = current.next;
		}
		// case2: index greatr than 0 but less than size
		int count = 0;
		while (current != null) {
			if (count == index) {
				previous.next = current.next;
				System.out.println("node deleted at index: " + index);
				break;
			} else {
				previous = current;
				current = current.next;
				count++;
			}
		}
		// case3: index entered is greater than size
		if (current == null) {
			System.out.println("Node index " + index + " not found");
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Menu_driven_List li = new Menu_driven_List();
		System.out.println("Do you want to enter the app: y/n");
		char c = s.next().charAt(0);
		try {
			while (c != 'n') {
				System.out.println(
						"Enter your choice: " + "\n" + "1. Insert " + "\n" + "2. Delete " + "\n" + "3. Display ");
				int choice = s.nextInt();
				switch (choice) {

				case 1:

					System.out.println("How many elemnets you want to insert?");
					int n = s.nextInt();
					for (int i = 0; i < n; i++) {
						System.out.println("Enter the " + (i + 1) + " element:");
						li.insert(li, s.nextInt());
					}
					break;

				case 2:
					System.out.println("Which index you want to delete?");
					li.deleteByIndex(li, s.nextInt());
					break;

				case 3:
					System.out.println("The elements in th list are: ");
					li.display(li);

				}

				System.out.println("Do you wish to continue? y/n");
				c = s.next().charAt(0);
			}
		}

		catch (Exception e) {
			System.out.println(e);
		}
		
		s.close();
	}

}