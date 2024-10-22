import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter String : ");
		String str = new Scanner(System.in).nextLine().toLowerCase();
		
		System.out.println(
				str.contentEquals(new StringBuffer(str).reverse())
				);
	}
}
