import java.util.Scanner;
public class reverse

{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Reverse Triangle Word:");
		String word = kb.next();
		System.out.println("");
		
		for(int i = word.length(); i > 0; i--)
		
		{
			System.out.println(word.substring(0,i));
		}
	}
}


