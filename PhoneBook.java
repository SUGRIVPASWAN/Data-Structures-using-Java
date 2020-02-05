import java.util.Scanner;
import java.util.HashMap;

public class PhoneBook {

	public static void findNumber(HashMap<String, Integer> h, String qs) {
		if(h.get(qs) != null) {
			System.out.println(qs + " = " + h.get(qs));
		}
		else {
			System.out.println("Query not found !!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of entries in the PhoneBook: ");
		int n = sc.nextInt();
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		for(int i = 0; i < n; i++) {
			System.out.print("Enter th name: ");
			String name = sc.next();
			System.out.print("Enter the number: ");
			int number = sc.nextInt();
			h.put(name, number);
			System.out.println();
		}

		System.out.print("Enter the no. of queries: ");
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			System.out.print("Enter the query: ");
			String qs = sc.next();
			findNumber(h, qs);
		}

		sc.close();
	}
}