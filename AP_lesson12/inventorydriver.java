import java.util.Scanner;
public class inventorydriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Item manufacturer:");
		String manufacturer = kb.nextLine();
		System.out.println("Item name:");
		String name = kb.nextLine();
		System.out.println("Would you like to enter a category and pricing info? (y or n)");
		String answer = kb.nextLine();
		if(answer.equals("y"))
		{
			System.out.println("Item category:");
			String category = kb.nextLine();
			System.out.println("Item price:");
			double price = kb.nextDouble();
			inventory object = new inventory(manufacturer, name, category, price);
			System.out.println();
			System.out.println(object);
		}
		else
		{
			inventory object = new inventory(manufacturer, name);
			System.out.println();
			System.out.println(object);
		}
	}
}

