import java.util.Scanner;
public class graph

{
	public static void main(String[]args)

	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number to multiply:");
		int num = kb.nextInt();
		System.out.println("Enter the size of the table:");
		int table = kb.nextInt();
		System.out.printf("\n%4s|%-4s\n", "x", num+" * x");

		for(int i = 1; i <= table; i++)
		{
			System.out.printf("%4d|%-4d\n", i, (i*num));
		
		}
	
	}

}


