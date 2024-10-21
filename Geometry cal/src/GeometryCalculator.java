import java.util.Scanner;

public class GeometryCalculator {
	double radius,len,wid,a,b,c;
	
	public GeometryCalculator(double rad) {
		this.radius = rad;
	}
	
	public GeometryCalculator(double len,double wid) {
		this.len = len;
		this.wid = wid;
	}
	
	GeometryCalculator(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	double areaOfCircle()
	{
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	double perimeterOfCircle()
	{
		return 2 * Math.PI * radius;
	}
	
	double areaOfRec()
	{
		return len*wid;
	}
	
	double perOfRec()
	{
		return 2 * (len+wid);
	}
	
	double areaOfTraingle()
	{
		double s = (a+b+c)/2;
		return Math.sqrt( s * (s-a) * (s-b) * (s-c));
	}
	
	double perOfTraingle()
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GeometryCalculator ob = null;
		while(true)
		{
			System.out.println("Enter shape: ");
			String shape = sc.next().toLowerCase();
			switch(shape)
			{
			case "circle":
				System.out.println("Enter Radius: ");
				ob = new GeometryCalculator(sc.nextDouble());
				System.out.println("1.Area \t 2. Perimeter: ");
				switch(sc.nextInt())
				{
				case 1:
					System.out.println(ob.areaOfCircle());
					break;
				case 2:
					System.out.println(ob.perimeterOfCircle());
					break;
				}
				break;
			case "rectangle":
				System.out.println("Enter Length & Width: ");
				ob = new GeometryCalculator(sc.nextDouble(),sc.nextDouble());
				System.out.println("1.Area \t 2. Perimeter: ");
				switch(sc.nextInt())
				{
				case 1:
					System.out.println(ob.areaOfRec());
					break;
				case 2:
					System.out.println(ob.perOfRec());
					break;
				}
				break;
			case "traingle":
				System.out.println("Enter 3 sides : a b c");
				ob = new GeometryCalculator(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
				System.out.println("1.Area \t 2. Perimeter: ");
				switch(sc.nextInt())
				{
				case 1:
					System.out.println(ob.areaOfTraingle());
					break;
				case 2:
					System.out.println(ob.perOfTraingle());
					break;
				}
				break;
			case "stop":
			case "done":
			case "exit":
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid Selection");
			}
		}
		
	}
}
