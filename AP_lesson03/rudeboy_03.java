import java.util.Scanner; //import Statement

public class rudeboy_03
{
	public static void main (String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//promt for the user input
		System.out.println("Hey, you can call me RudeBoy666. What is your name?");
		
		String name = keyboard.next();
		
		//print the results...
		System.out.println(name + " is creatively one of the worst names I've ever heard");
	
		System.out.println("How old are you boy?");
		
		int num = keyboard.nextInt();
		
		System.out.println(num + "!  ...you dont have much longer to live");
	
		System.out.println("What kind of dumb things do you do for fun?");
		
		String hobby = keyboard.next();

		//print the results...
		System.out.println("Damn, "  + hobby + "?  Sounds boring.");
		
		System.out.println("What kind of music do you listen to?");
		
		String music = keyboard.next();
		
		System.out.println(music + "?  Is that similar to Justin Bieber?");
		
		System.out.println("How many siblings do you have?");
		
		String siblings = keyboard.next();
		
		System.out.println(siblings + "! Hopefully none of your family reproduces anymore!");
		
		System.out.println("What do you want to be when you grow up?");
		
		String career = keyboard.next();
		
		System.out.println("You should just give up on becoming a " + career);
		
		
		
		
	}
	
}