import java.util.Scanner;

public class AlphaNumeric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		int upper = 0, lower = 0, dig = 0, sym = 0, sum = 0;
		for(char temp : str.toCharArray())
		{
			if( temp >= 65 && temp <= 90)
				upper++;
			else if(Character.isLowerCase(temp))
				lower++;
			else if (Character.isDigit(temp))
			{
				dig++;
				sum += Integer.parseInt(String.valueOf(temp) );
			}
			else
				sym++;		
		}
		System.out.println("Upper : "+upper);
		System.out.println("Lower : "+lower);
		System.out.println("Digits : "+dig);
		System.out.println("Symbols : "+sym);
		System.out.println("Sum : "+sum);
		sc.close();
	}
}
