import java.util.Scanner;
public class treedeg60

{
	public static void main(String[]args)

	{

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = kb.next();
		int stop = word.length();
		tree(word, 0, stop);

	}

	public static void tree(String w, int s, int st)

	{
		if(s <= st)

		{
			System.out.printf("%20s\n",w.substring(0,s));
			s = 1 + s;
			tree(w, s, st);

		}
	}
}

