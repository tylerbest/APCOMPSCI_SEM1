import java.util.Scanner;
public class userdriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("First name:");
		String firstName = kb.nextLine();
		System.out.println("Last name:");
		String lastName = kb.nextLine();
		System.out.println("Would you like to use a public avatar? (y or n)");
		String answer = kb.nextLine();
		if(answer.equals("n"))
		{
			user object = new user(firstName, lastName);
			System.out.println();
			System.out.println(object);
		}
		else
		{
			System.out.println("Avatar name:");
			String avatar = kb.nextLine();
			user object = new user(firstName, lastName, avatar);
			System.out.println();
			System.out.println(object);
		}
	}
}

