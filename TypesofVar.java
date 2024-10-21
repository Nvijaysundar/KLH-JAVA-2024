class TypesofVar{
	static int a = 20; //static variable
	int b = 30; //instance variable
	public static void main(String [] args)
	{
		int c = 40;//local variable
		System.out.println("a :" +TypesofVar.a);
		System.out.println("c :" +c);
		TypesofVar ob = new TypesofVar();
		System.out.println("b :" +ob.b);
		System.out.println("--------------");
		TypesofVar.a += 100;
		ob.b += 200;
		System.out.println("a :" +TypesofVar.a);
		System.out.println("c :" +c);
		System.out.println("b :" +ob.b);
		System.out.println("--------------");
		TypesofVar ob2 = new TypesofVar();
		System.out.println("a :" +TypesofVar.a);
		System.out.println("c :" +c);
		System.out.println("b :" +ob2.b);
	}
}