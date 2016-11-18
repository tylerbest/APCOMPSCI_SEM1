import java.util.Scanner;
public class count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter an even number to count up to in increments of 2");

		int num = kb.nextInt();

		System.out.println("");

		for(int i = 2; i <= num; i+=2)
		{

			System.out.printf("%d.2", i);

		}
		System.out.println("");
	}


}


