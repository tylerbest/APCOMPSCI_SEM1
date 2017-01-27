import java.util.Scanner;
public class distancerunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the x-coordinate:");
		int xOne = kb.nextInt();
		System.out.println("Enter the y-coordinate:");
		int yOne = kb.nextInt();
		System.out.println("Enter another x-coordinate:");
		int xTwo = kb.nextInt();
		System.out.println("Enter another y-coordinate:");
		int yTwo = kb.nextInt();
		distance object = new distance(xOne, yOne, xTwo, yTwo);
		System.out.println("distance is " + object.getDist());
	}
}
