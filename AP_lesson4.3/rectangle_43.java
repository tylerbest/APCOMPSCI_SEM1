import java.util.Scanner;
public class rectangle_43
{
public static void main(String[]args)
	{ 	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Length of the Rectangle:");
		double l = keyboard.nextInt();
		System.out.println("Width of the Rectangle");
		double w = keyboard.nextInt();
		print(calcPerim(l, w));
	
	}
	public static double calcPerim(double l, double w) 
	{
		return 2*(l+w);
	}
	public static void print(double perimeter)
	{
		System.out.println("The perimeter of your rectangle is " + perimeter);	
	}
}
	