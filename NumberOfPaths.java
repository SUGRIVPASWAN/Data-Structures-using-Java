import java.util.Scanner;

public class NumberOfPaths {

	public static int path(int n, int m) {
		if(n == 0 || m == 0) {
			return 1;
		}
		else {
			return( path(n-1,m) + path(n, m-1));
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter teh no. of test cases: ");
		int t = s.nextInt();
		for(int tc = 0; tc < t; tc++) {
			System.out.print("Enter the value of n: ");
			int n = s.nextInt();
			System.out.print("Enter the value of m: ");
			int m = s.nextInt();
			int paths = path(n, m);
			System.out.println("No. of paths to reach origin: " + paths);
			System.out.println();
		}
	}
} 