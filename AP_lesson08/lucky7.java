import java.util.Scanner;
public class lucky7
{
	public static void main(String[]args)

	{

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number to find out its luckiness:");
		int number = kb.nextInt();
		System.out.println("The luckiness gauge of your number is" + luck(number));

	}
	
	public static int luck(int n)

	{
		if(n > 0)

		{
			if(n % 10 == 7)
			{
				return 1 + luck(n/10);
			}
			return 0 + luck(n/10);
		}

		return 0;

	}
}

