import java.util.Scanner;

public class CandyProblem {

	public static int findMinCandies(int r[]) {
		int l = r.length;
		int sumCandies = 0;
		int i = 0;
		int c[] = new int[l];
		for(i = 0; i < l; i++ ) {
			c[i] = 1;
		}
		for(i = 0; i < l - 1; i++) {
			if(r[i] < r[i+1]) {
				c[i+1] = c[i] + 1;
			}
		}
		for(i = l-1; i > 0; i--) {
			if(r[i] < r[i-1] && c[i-1] < (c[i] +1) ) {
					c[i-1] = c[i] + 1;
			}
		}
		for(i = 0; i < l; i++) {
			sumCandies += c[i];
		}
		return sumCandies;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no. of children: ");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the priority of children: ");
		for(int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		int minCandies = findMinCandies(arr);
		System.out.println("Minimum candies to be distribute = " + minCandies);
		s.close();
	}

}