import java.util.Scanner;

public class SumOfSubMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the test cases: ");
		int t = sc.nextInt();
		for(int tc = 0; tc < t; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int ar[][] = new int[n][m];
			System.out.println("Enter the elements: ");
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					ar[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the coordinates of sub Matrix: ");
			int r1 = sc.nextInt();
			int c1 = sc.nextInt();
			int r2 = sc.nextInt();
			int c2 = sc.nextInt();
			int sum = 0;
			for(int i = r1-1; i < r2; i++) {
				for(int j = c1-1; j < c2; j++) {
					sum = sum + ar[i][j];
				}
			}
			System.out.println("Sum = " + sum);
		}
	}
}