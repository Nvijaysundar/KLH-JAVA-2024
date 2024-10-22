import java.util.Scanner;

public class Executor1 {
	public static void main(String[] args) {
		String str = "Java Programming",
				str2 = "             Hai Hello     ".strip();
		str2 = str2.concat("Everyone");
		System.out.println(str2);
		
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println(str2.isBlank());
		
		char ch = str.charAt(3);
		System.out.println(ch);
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * char ch2 = sc.nextLine().charAt(0);
		 */
		System.out.println(str.startsWith("ava",1));
		System.out.println(str.endsWith("ming"));
		System.out.println(str.contains("gram"));
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,9));
		System.out.println(str.toString());
		System.out.println(str.replace('a', 'z'));
		System.out.println(str.replaceFirst("a","z"));
		System.out.println(str.replaceAll("[aP]","nitro"));
		String [] aarr = str.split("a");
		for( String temp : aarr)
			System.out.print(temp +" ");
		System.out.println();
		
		System.out.println(str2.trim()+"Nitro");
		char [] charr = str.toCharArray();
		for(char temp : charr)
			System.out.print(temp +" ");
	}
}
