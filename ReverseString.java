import java.util.Scanner;
public class ReverseString {

	public static String reverse(String st) {
		String st2[]=st.split("\\.");
		String res="";
		for(int i=st2.length-1;i>=0;i--) {
			res=res+st2[i];
			if(i>0) {
				res=res+".";
			}
		}
		return res;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of test cases: ");
		int testCases=sc.nextInt();
		for(int t=0;t<testCases;t++) {	
			System.out.print("Enter the string: ");
			String s1=sc.next();
			String s2=reverse(s1);
			System.out.println("Reversed String => "+s2);
		}
		sc.close();
	}
}