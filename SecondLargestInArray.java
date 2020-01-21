import java.util.Scanner;
public class SecondLargestInArray {

	public static void findSecondLargest(int arr[]) {
		int l=arr.length;
		int a,b;
		a=Integer.MIN_VALUE;
		b=Integer.MIN_VALUE;
		for(int i=0;i<l;i++){
			if(a<arr[i]) {
				a=arr[i];
			}
		}
		for(int i=0;i<l;i++) {
			if(b<arr[i] && a!=arr[i]) {
				b=arr[i];
			}
		}
		System.out.println("Largest Value: "+a);
		System.out.println("Second Largest: "+b);
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array ");
		for(int i=0;i<size;i++)	{
			arr[i]=sc.nextInt();
		}
		findSecondLargest(arr);
		sc.close();
	}
}