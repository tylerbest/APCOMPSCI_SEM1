import java.util.Scanner;
public class circle
{
	static int r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Radius:");
		r = keyboard.nextInt();
		
		calcArea();
		print();
	}
	public static void calcArea()
	{
		area = 3.14 * (r * r);
	}
	public static void print()
	{
		System.out.println("The area of a circle with radius " + r +" is area " + area);	
	}
}