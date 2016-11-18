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
		
		else System.out.println("Incorrect, try again.");
	
	}
	
	
	
}