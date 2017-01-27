import java.util.Scanner;
public class findthezs
{
	static String[]words = new String[5];
	public static void main(String[]args)
	{
		fillArray();
		printArray();
		System.out.println("\nOnly"+ hasZs() + " contain(s) the letter z.");
	}

	public static void fillArray()

	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	public static void printArray()
	{
		System.out.println("For the words...");
		for(String word : words)
		{
			System.out.print(word + " ");
		}
	}
	public static String hasZs()
	{
		String z = " ";
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				z = z.substring(0, z.length()) + " " + word.substring(0, word.length());
			}
		}
		return z;
	}
}


