import java.util.Scanner;
public class receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter Item 1: ");
		String item1 = kb.next();
		System.out.println("Enter the Price: ");
		double price1 = kb.nextDouble();
		System.out.println("Enter Item 2: ");
		String item2 = kb.next();
		System.out.println("Enter the Price: ");
		double price2 = kb.nextDouble();
		System.out.println("Enter Item 3: ");
		String item3 = kb.next();
		System.out.println("Enter the Price: ");
		double price3 = kb.nextDouble();
		System.out.println("Enter Item 4: ");
		String item4 = kb.next();
		System.out.println("Enter the Price: ");
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = calcDisc(subtotal);
		double tax = subtotal * .08;
		double total = subtotal - discount + tax;
		
		System.out.println("^^^^^^^^^^^Receipt^^^^^^^^^^^");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		format("Subtotal: ", subtotal);
		format("Tax: ", tax);
		format("Discount: ", discount);
		format("Total: ", total);
		System.out.println("\n^^^^^^^^^^Thank You^^^^^^^^^^");
	}
	public static double calcDisc(double subtotal)
	{
		if (subtotal >= 2000)
			return subtotal * 0.15;
		return 0.0;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("\n%15s..........%10.2f", item, price);
	}
	
}

