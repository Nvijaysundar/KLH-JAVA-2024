import java.util.StringTokenizer;

public class Ex1 {
	public static void main(String[] args) {
		String str = "Hi i'm learning java Programming madam";
		int palin = 0;
		StringTokenizer sj = new StringTokenizer(str);
		while(sj.hasMoreTokens())
		{
			String str2 = sj.nextToken();
			StringBuffer sb = new StringBuffer(str2);
			System.out.println(sb.reverse());
			if(str2.equalsIgnoreCase(sb.toString()))
				palin++;
			
		}
		System.out.println(palin);
	}
}
