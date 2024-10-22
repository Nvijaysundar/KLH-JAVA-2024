
public class Ex1 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hai");
		System.out.println(sb.toString());
		sb.insert(1,"Hello");
		System.out.println(sb.toString());
		sb.delete(1,6);
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
	}
}
