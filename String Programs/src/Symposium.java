import java.util.Scanner;

public class Symposium {
	static Scanner sc = new Scanner(System.in);
	static void cseEvents()
	{
		System.out.println("Welcome to CSE");
		System.out.println("1.Hackathon\t 2. DBMS :: ");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			System.out.println("Hackathon - H1-01");
			break;
		case 2:
			System.out.println("DBMS Workshop - H2-03");
			break;
		}
	}
	static void eceEvents()
	{
		System.out.println("Welcome to ECE");
		System.out.println("1.PCB \t 2. RaspberryPI :: ");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			System.out.println("PCB - H1-11");
			break;
		case 2:
			System.out.println("RaspberryPI - H2-22");
			break;
		}
	}
	public static void main(String[] args) {
		selectChoice();
	}
	private static void selectChoice() {
		System.out.println("Welcome to Symposium");
		System.out.println("1.By Roll \t 2. By Branch \t 3.exit:: ");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			byRoll(sc);
			break;
		case 2:
			byBranch();
			break;
		case 3:
			System.out.println("Thanks For Joining Symposium");
			sc.close();
			System.exit(0);
		}
		selectChoice();
	}
	private static void byBranch() {
		System.out.println("Select Branch");
		System.out.println("ECE\tCSE\tMech :: ");
		switch(sc.nextLine().toLowerCase())
		{
		case "cse":
			cseEvents();
			break;
		case "ece":
			eceEvents();
			break;
		default :
			System.out.println("Selected Branch Not available");
		}
	}
	private static void byRoll(Scanner sc) {
		System.out.println("enter Roll : ");
		switch(sc.nextLine().charAt(5))
		{
		case '3':
			cseEvents();
			break;
		case '4':
			eceEvents();
			break;
		default : 
			System.out.println("No Branch Selected");
		}
	}
}
