import java.util.StringJoiner;

public class Ex1 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("/");
		sj.add("22");
		sj.add("10");
		sj.add("2024");
		System.out.println(sj.toString());
		StringJoiner sj2 = new StringJoiner("-");
		sj2.setEmptyValue("StringJoiner is empty");
		System.out.println(sj2.toString());
		sj2.add("Hello");
		sj2.add("World");
		System.out.println(sj2.toString());
		sj.merge(sj2);
		System.out.println(sj.toString());
		
	}
}
