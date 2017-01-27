import java.util.Scanner;
public class password2
{
	public static void main (String[]args)
	{
		recursion();

	}
	public static void recursion()
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter Username");
		String username = kb.next();
		
		System.out.println("Enter Password");
		String password = kb.next();
		if(username.equals("tyler") && password.equals("pw"))
		{
			System.out.println("Access Granted");
		}
		else if (username.equals("tyler"))
		{
			System.out.println("Password incorrect");
			recursion();
		}
		else if (password.equals("pw"))
		{
			System.out.println("Your username is incorrect");
			recursion();
		}
		else
		{
			System.out.println("Username and Password are incorrect");
			recursion();
		}
	}
}