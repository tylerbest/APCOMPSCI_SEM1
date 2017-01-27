import java.util.Scanner;
public class factorial

{


	public static void main(String[]args)

	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number for the factorial:");
		int num = kb.nextInt();
		int fac = 1;

		System.out.println("");

		for(int i = 1; i <= num; i++)
		{

			System.out.println(i*fac);
			fac=i*fac;
		}


	}


}


