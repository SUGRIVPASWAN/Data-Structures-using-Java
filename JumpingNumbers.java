import java.util.Scanner;

public class JumpingNumbers {

	public static void jumpingNumbers(int n) {
		if(n < 10) {

			for(int i = 0; i <= n; i++) {
				System.out.print(i + " ");
			}

		}

		else {

			int z = n/10;
			if(z < 10) {

				for(int i = 0; i < 10; i++) {
					System.out.print(i + " ");
				}

				for(int i = 1; i <= z; i++) {
					int num1 = (i * 10) + (i-1);
					int num2 = (i * 10) + (i+1);
					if(num1 <= n) {
						System.out.print(num1 + " ");
					}
					if(num2 <= n) {
						System.out.print(num2 + " ");
					}
				}

			}

			else {

				for(int i = 0; i < 10; i++) {
					System.out.print(i + " ");
				}

				for(int i = 1; i < z; i++) {
					int num1 = (i * 10) + (i-1);
					int num2 = (i * 10) + (i+1);
					if(num1 <= n && num1 < 100) {
						System.out.print(num1 + " ");
					}
					if(num2 <= n && num2 < 100) {
						System.out.print(num2 + " ");
					}
				}

				for(int i = 10; i <= z; i++) {
					int num1 = (i * 10) + (i - 9);
					int num2 = (i * 10) + (i + 1);
					if(num1 <= n) {
						System.out.print(num1 + " ");
					}
					if(num2 <= n) {
						System.out.print(num2 + " ");
					}
				}

			}

		}

		System.out.println();
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of test Cases: ");
		int t = sc.nextInt();
		for(int tc = 0; tc < t; tc++) {
			System.out.print("Enter the number: ");
			int n = sc.nextInt();
			System.out.println("Jumping numbers are: ");
			jumpingNumbers(n);
		}
	}
}