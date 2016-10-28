import java.util.Scanner; 
public class lesson_04
{
	public static void main(String[]args)
	{
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please Enter item 1");
		String itemone = keyboard.next();
		System.out.println("Please Enter the price");
		Double priceone = keyboard.nextDouble();
		System.out.println("Please Enter item 2");
		String itemtwo = keyboard.next();
		System.out.println("Please Enter the price");
		Double pricetwo = keyboard.nextDouble();
		System.out.println("Please Enter item 3");
		String itemthree = keyboard.next();
		System.out.println("Please Enter the price");
		Double pricethree = keyboard.nextDouble();
		
		form.format(itemone, priceone);
		
	}
	
		
		public void format(String item, double price)
		{
			System.out.printf("\n%10s   %10.2f", item, price);
		}
		

}

