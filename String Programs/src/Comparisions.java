
public class Comparisions {
	public static void main(String[] args) {
		String str = "Java",str2 = "Java";
		String str3 = new String("java"),str4 = new String("Java");
		
		System.out.println(str.equals(str3));
		System.out.println(str3.compareToIgnoreCase(str2));
	}
}
