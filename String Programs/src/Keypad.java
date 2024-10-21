import java.util.Scanner;

public class Keypad {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter String : ");
		String str = sc.nextLine().toLowerCase();
		System.out.println(
			str.replaceAll("[abc]","2").replaceAll("[def]","3")
			.replaceAll("[ghi]", "4").replaceAll("[jkl]","5")
			.replaceAll("[mno]","6").replaceAll("[pqrs]", "7")
			.replaceAll("[tuv]", "8").replaceAll("[wxyz]","9")
			.toString()
				);
		sc.close();
	}
}
