
public class Ex1 {
	void func(int n)
	{
		System.out.println(n*(n+1));
	}
	public static void main(String[] args) {
		int num = 5;
		
		//object access
		Ex1 ob = new Ex1();
			ob.func(num);

		//reference access
		new Ex1().func(num);
		
		
	}
}
