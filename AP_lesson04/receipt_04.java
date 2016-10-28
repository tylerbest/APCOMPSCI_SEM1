import java.util.Scanner; //import Statement
public class receipt_04
{
	public static void main(String[]args)
	{
		receipt_04 form = new receipt_04();
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please Enter item 1");
		String itemone = keyboard.next();
		System.out.println("Please Enter the price");
		double priceone = keyboard.nextDouble();
		System.out.println("Please Enter item 2");
		String itemtwo = keyboard.next();
		System.out.println("Please Enter the price");
		double pricetwo = keyboard.nextDouble();
		System.out.println("Please Enter item 3");
		String itemthree = keyboard.next();
		System.out.println("Please Enter the price");
		double pricethree = keyboard.nextDouble();
		System.out.println("      *********_Receipt_*********");
		
		form.format(itemone, priceone);
		
		form.format(itemtwo, pricetwo);
		
		form.format(itemthree, pricethree);
		
		double subtotal = (priceone + pricetwo + pricethree);
		
		form.format("Subtotal: ", subtotal);
		
		double tax = (.08);
		
		double taxed = (subtotal*tax);
		
		form.format("Tax: ", taxed);
	
		form.format("Total: ", subtotal + taxed);
	
		
		
		System.out.println("\n     *********_Thank You_*********");
	}
			public void format(String item, double price)
		{
			System.out.printf("\n%10s..........%10.2f", item, price);
		}
		

}

