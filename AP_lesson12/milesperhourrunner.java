import java.util.Scanner;
public class milesperhourrunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter distance in miles:");
		int distance = kb.nextInt();
		System.out.println("Enter total hours of travel:");
		int hours = kb.nextInt();
		System.out.println("Enter minutes:");
		int minutes = kb.nextInt();
		double mph = 0;
		milesperhour object = new milesperhour(distance, hours, minutes, mph);
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + object.getMph() + " mph");
	}
}