import java.util.Scanner;

public class findX {

	public static void find(int m, int n) {
		int sum = ((m) * (m + 1))/2;
		if(n % sum == 0) {
			System.out.println("0");
			return;
		}
		else {
			float z = (float)n / sum;
			String s = "";
			s = s + z;
			//System.out.println(s);
			String s2 = "";
			int index = 0;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '.') {
					index = i;
					break;
				}
			}
			for(int i = index+1; i < s.length(); i++) {
				s2 = s2 + s.charAt(i);
			}
			if(s2.length() > 6 ) {
				System.out.println("-1");
			}
			else {
				System.out.println("1");
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		find(m, n);
	}
}