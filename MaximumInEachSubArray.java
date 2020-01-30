import java.util.Scanner;
import java.util.Arrays;
public class MaximumInEachSubArray {

	public static void findMaximum(int arr[]) {
		Arrays.sort(arr);
		System.out.print(arr[arr.length - 1] +" ");
	}

	public static void findSubArray(int arr[], int k, int i) {
		int arr1[] = new int[k];
		int count = 0;
		while(i < arr.length && count < k) {
			arr1[count] = arr[i];
			count ++;
			i++;
		}
		findMaximum(arr1);
		if(i < arr.length) {
			findSubArray(arr, k, i-2);
		}
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		System.out.print("Enter the size of sub Arrays: ");
		int k = s.nextInt();

		findSubArray(arr, k, 0);
		s.close();
	}
}