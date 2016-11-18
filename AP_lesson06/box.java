import java.util.Scanner;
public class box
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter Word:");

		String word = kb.next();

		System.out.println("");


		for(int i = 0; i < word.length(); i++)
		{

			System.out.println(word);

		}

	}

}


