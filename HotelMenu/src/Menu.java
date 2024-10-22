import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Menu {
	static String rItem = "Idly,Dosa,Wada,Coffee,Tea";
	static String rPrice = "30,50,40,15,10";
	static String cItem ="" ,cPrice="";
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true)
		{
			System.out.println("1.Admin 2.Customer 3.Exit ::");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				adminActivites();
				break;
			case 2:
				customerActivites();
				break;
			case 3:
				sc.close();
				System.exit(0);
			}
		}
	}
	private static void customerActivites() {
		System.out.println("1.Order Item :: ");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			OrderItem();
			break;
		
		}
	}
	private static void OrderItem() {
		System.out.println("Enter Item : ");
		String Item = sc.nextLine();
		if(rItem.contains(Item)){
			cItem = cItem.concat(Item+" ");
			cPrice = cPrice.concat(getPrice(Item)+" ");
		}
		else
			System.out.println("Item Not Available");
		System.out.println("DO you wish to order More: Y/N");
		switch(sc.nextLine())
		{
		case "y":
		case "Y":
			OrderItem();
			break;
		case "n":
		case "N":
			getBill();
			System.out.println("Thanks For Order");
			System.exit(0);
		}
	}
	private static void getBill() {
		int sum = 0;
		StringTokenizer st1 = new StringTokenizer(cItem),
				st2 = new StringTokenizer(cPrice);
		while(st1.hasMoreElements()&& st2.hasMoreTokens())
		{
			int cprice = Integer.parseInt(st2.nextToken());
			sum += cprice;
			System.out.println(st1.nextToken()+"\t\t"+cprice);
		}
		System.out.println("Total \t\t "+sum);
	}
	private static String getPrice(String item) {
		int index = -1;
		String[] Items = rItem.split(",");
		for(int i=0;i<Items.length;i++)
		{
			if(Items[i].equalsIgnoreCase(item))
			{
				index = i;
				break;
			}
		}
		
		String[] prices = rPrice.split(",");
		return prices[index];
	}
	private static void adminActivites() {
		System.out.println("1.Show Menu\n2.Add Item\n3.UpdateItem");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			showMenu();
			break;
		case 2:
			addItem();
			break;
		case 3:
			updatePrice();
			break;
		}
	}
	private static void updatePrice() {
		System.out.println("Enter Item Name : ");
		String item = sc.nextLine();
		if(rItem.contains(item))
		{
			int index = -1;
			String[] Items = rItem.split(",");
			for(int i=0;i<Items.length;i++)
			{
				if(Items[i].equalsIgnoreCase(item))
				{
					index = i;
					break;
				}
			}
			
			String[] prices = rPrice.split(",");
			System.out.print("Enter New Price: ");
			prices[index] = sc.nextLine();
			StringJoiner sj = new StringJoiner(",");
			for(String temp : prices)
			{
				sj.add(temp);
			}
			rPrice = sj.toString();
		} 
	}
	private static void addItem() {
		System.out.println("Enter Item Name : ");
		String newItem = sc.nextLine();
		if(!rItem.contains(newItem))
		{
			rItem = rItem.concat(","+newItem);
			System.out.println("Enter Price: ");
			rPrice = rPrice.concat(","+sc.nextLine());
		}
		else
			System.out.println("Item already Available");

	}
	
	
	private static void showMenu() {
		StringTokenizer st1 = new StringTokenizer(rItem,","),
				st2 = new StringTokenizer(rPrice,",");
		System.out.println("ItemName\tPrice");
		while(st1.hasMoreTokens() && st2.hasMoreTokens())
		{
			System.out.print(st1.nextToken()+"\t\t"+st2.nextToken()+"\n");
		}
	}
}
