
public class Employee {
	String name,emailid,empid;
	float bsal;
	
	Employee(String name, String email, String empid, float bsal)
	{
		this.name = name;
		this.emailid = email;
		this.empid = empid;
		this.bsal = bsal;
	}
	
	void getDetails()
	{
		System.out.println("Name : " + this.name);
		System.out.println("Email: "+ this.emailid);
		System.out.println("Empid: "+this.empid);
		System.out.println("Bsal : "+this.bsal);
		System.out.println("TSal : "+Employee.calSal(this.bsal));
	}
	
	static float calSal(float bsal)
	{
		return bsal + 0.08f*bsal + 0.12f*bsal;
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Alpha","alpha@gmail.com","a121",25436.78f);
		e1.getDetails();
		Employee e2 = new Employee("Beta","beta@gmail.com","A122",36415.42f);
		e2.getDetails();
	}
}
