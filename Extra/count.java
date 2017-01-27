import java.util.Scanner;
public class count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter an even number to count up to in increments of 2");

		int to = kb.nextInt();
		
		System.out.println("Enter a number to count by");
		int by = kb.nextInt();

		System.out.println("");

		for(int i = by; i <= to; i+=by)
		{

			System.out.printf("%d\t", i);

		}
		System.out.println("");
	}


}


