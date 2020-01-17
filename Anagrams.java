import java.util.Scanner;
import java.util.Arrays;
public class Anagrams {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String a;
		String b;
		System.out.print("Enter the first string: ");
		a=s.nextLine();
		System.out.print("Enter the second string: ");
		b=s.nextLine();
		check_Anagram(a,b);
		s.close();
	}
	public static void check_Anagram(String a ,String b) {
		if(a.length()!=b.length()) {
			System.out.println(a + " and " + b + " are Not anagrams");
		}
		else {
			char arr1[]= a.toLowerCase().toCharArray();
			char arr2[]= b.toLowerCase().toCharArray();	
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			 if (Arrays.equals(arr1,arr2)) {  
	            System.out.print(a + " and " + b + " are Anagrams");  
	        } else {  
	            System.out.print(a + " and " + b + " are Not Anagrams");  
	        }  
	    }
	}
}