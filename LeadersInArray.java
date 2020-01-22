import java.util.Scanner;
public class LeadersInArray {

	public static void findLeaders(int arr[]) {
		int l=arr.length;
		int leader;
		int flag=0;
		for(int i=0;i<l;i++) {
			leader=arr[i];
			flag=0;
			for(int j=i;j<l;j++) {
				if(leader<arr[j]) {
					flag=1;
					break;
				}	
			}
			if(flag==0) {
				System.out.print(leader+" ");
			}
		}
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		findLeaders(arr);
		s.close();
	}
}