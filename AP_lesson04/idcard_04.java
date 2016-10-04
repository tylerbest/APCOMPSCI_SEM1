import java.util.Scanner; //import Statement
public class idcard_04
{
	public static void main(String[]args)
	{
		idcard_04 form = new idcard_04();
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your first name");
		String itemone = keyboard.next();
		System.out.println("Enter your last name");
		String thingone = keyboard.next();
		
		
		System.out.println("Enter your title");
		String itemtwo = keyboard.next();
		System.out.println("Enter your school");
		String thingtwo = keyboard.next();
		
		
		System.out.println("Enter your grade");
		String itemthree = keyboard.next();
		System.out.println("Enter your major");
		String thingthree = keyboard.next();
		
		System.out.println("\n	******************");
		form.format("*" + itemtwo, thingtwo + "*");
		form.format("*" + itemone, thingone + "*");
		form.format("*" + itemthree, thingthree + "*");
		System.out.println("\n     ******************");
		
		
		
		
		
	
	
	}
			public void format(String item, String thing)
		{
			System.out.printf("\n%10s   %10s", item, thing);
		}
		
	}