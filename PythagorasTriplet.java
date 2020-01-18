import java.util.Scanner;
public class PythagorasTriplet {
	public static boolean checkTriplet(int arr1[]) {
		int len=arr1.length;
		int a,b,c;
		for(int i=0;i<len;i++) {
			a=arr1[i];
			for(int j=0;j<len;j++) {
				b=arr1[j];
				for(int k=0;k<len;k++) {
					c=arr1[k];
					if((c*c) == ((a*a) + (b*b))) {
						return true;
					}
				} 
			}
			
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no. of test cases: ");
		int t=s.nextInt();
		for(int testCase=0;testCase<t;testCase++) {
			System.out.print("Enter the size of the array: ");
			int size=s.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the elements of the array");
			for(int i=0;i<size;i++) {
				arr[i]=s.nextInt();
			}
			if(checkTriplet(arr)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}