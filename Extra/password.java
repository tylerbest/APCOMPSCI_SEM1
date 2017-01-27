import java.util.Scanner;
public class password

{
	static Scanner kb;
	static String username = "TylerB831";
	static String password = "thaiboi";

	public static void main(String[]args)

	{
		kb = new Scanner(System.in);
		passCheck();
	}
	
	public static void passCheck()

	{


		System.out.println("Login:");
		System.out.println("Enter Username:");
		String userInput = kb.nextLine();
		System.out.println("Enter Password");
		String passInput = kb.nextLine();


		if(userInput.equals(username) && passInput.equals(password))
		{
			System.out.println("You are granted access.");
		}
		else if(username.equals("TylerB831"))
		{
			System.out.println("Password Incorrect, try again.");
			
		}
		else if(password.equals("thaiboi"))
		{
			System.out.println("Username Incorrect, try again.");
			
		}
		else 
		{
			System.out.println("Username and Password are incorrect");
		
		}
			
	
	}
	
	
	
}