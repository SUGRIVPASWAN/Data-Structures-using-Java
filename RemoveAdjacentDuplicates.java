import java.util.Scanner;
public class RemoveAdjacentDuplicates {

	public static String removeDuplicate(String s1) {
		String s2="";
		char ch[]=s1.toCharArray();
		if(ch[0] != ch[1]) {
			s2=s2+ch[0];
		}
		for(int i=1;i<s1.length()-1;i++) {
			if(ch[i] != ch[i+1] && ch[i] != ch[i-1]) {
				s2=s2+ch[i];
			}

		}
		if(ch[s1.length()-1] != ch[s1.length()-2]) {
			s2=s2+ch[s1.length()-1];
		}
		return s2;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of test cases: ");
		int testCases=sc.nextInt();
		for(int t=0;t<testCases;t++) {	
			System.out.print("Enter the string: ");
			String str=sc.next();
			System.out.println(removeDuplicate(str));
		}
		sc.close();
	}
}
