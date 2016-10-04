import java.util.Scanner; //import Statement

public class myprogram_03
{
	public static void main (String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//promt for the user input
		System.out.println("What's your favorite baseball team?");
		
		String name = keyboard.next();
		
		//print the results...
		System.out.println("according to my calculations the  " + name + "will beat the Padres this year");
	
		System.out.println("What's your favorite football team?");
		
		String num = keyboard.next();
		
		System.out.println(num + "!  ...they're gonna romp the Chargers this year.");
	
		
		
		
		
	}
	
}