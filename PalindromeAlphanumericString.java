import java.util.Scanner;

public class PalindromeAlphanumericString {

	public static void checkPalindrome(String s) {
		String s1 = "";
		String s2 = "";
		s = s.toLowerCase();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if( (c >= 'a' && c <= 'z' ) || (c >= '0' && c <='9')) {
				s1 = s1 + c;
			}
		}
		for(int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		if(s1.equals(s2)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of test cases: ");
		int tc = sc.nextInt();
		sc.nextLine();
		
		for(int t = 0; t < tc; t++) {
			System.out.print("Enter the string: ");
			String s = sc.nextLine();
			checkPalindrome(s);
		}
		sc.close();
	}
}