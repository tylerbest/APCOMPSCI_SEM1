import java.util.Scanner;
public class cardriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What Color would you like? ");
		String color = kb.nextLine();
		System.out.println("What type of Interior? ");
		String inside = kb.nextLine();
		System.out.println("What kind of Engine? ");
		String gas = kb.nextLine();
		System.out.println("How large of tires? ");
		String wheels = kb.nextLine();
		car object = new car(color, inside, gas, wheels);
		System.out.println("Your ride has been pimped");
		System.out.println("Paint: " + object.getPaint() + "\nInterior: " + object.getInterior() + "\nEngine: " + object.getEngine() + "\nTires: " + object.getTires());
		object.setCustom(color,inside,gas,wheels);	
	}
}

