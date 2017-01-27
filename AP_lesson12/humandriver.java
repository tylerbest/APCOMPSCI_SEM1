import java.util.Scanner;
public class humandriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Hair Color:");
		String hair = kb.nextLine();
		System.out.println("Eye Color:");
		String eyes = kb.nextLine();
		System.out.println("Skin Color:");
		String skin = kb.nextLine();
		human object = new human(" Dark Brown", "Brown", "Yellow");
		System.out.println("My info....\nHair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
		human object1 = new human(hair, eyes, skin);
		System.out.println("Your info....\nHair: " + object1.getHair() + "\nEyes: " + object1.getEyes() + "\nSkin: " + object1.getSkin());
	}
}
