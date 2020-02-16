import java.util.Scanner;

public class Triplet_In_Array {

	public static int findTriplets(int ar[]) {
		int n = ar.length;
		for(int i = 0; i < n-2; i++) {
			for(int j = i + 1; j < n-1; j++) {
				for(int k = j + 1; k < n; k++) {
					if((ar[i] + ar[j] + ar[k]) == 0) {
						return 1;
					}
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no. test cases: ");
		int t = s.nextInt();
		for(int tc = 0; tc < t; tc++) {

			System.out.print("Enter the size of the array: ");
			int size = s.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter the elements of the array");
			for(int i = 0; i < size; i++) {
				arr[i] = s.nextInt();
			}
			System.out.println();
			System.out.println(findTriplets(arr));
		}
	}
}