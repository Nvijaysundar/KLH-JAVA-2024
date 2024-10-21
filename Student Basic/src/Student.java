
public class Student {
	String name, email;
	long roll, mob;

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Alpha";
		s1.roll = 12345l;
		s1.email = "alpha@gmail.com";
		s1.mob = 9876543210l;
		System.out.println(s1);
		Student s2 = new Student();
		s2.name = "Beta";
		s2.mob = 7894561230l;
		s2.email = "beta@gmail.com";
		s2.roll = 145236;
		
		Student s3 = new Student();
		s3.name = "Gamma";
		s3.roll = 741236l;
		s3.email = "gamma@gmail.com";
		s3.mob = 7418529630L;
		
		System.out.println("Name : "+s1.name);
		
		System.out.println("Email : "+s2.email);
		System.out.println("Mob : "+s3.mob);
		
	}
}
