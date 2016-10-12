import java.util.Scanner;
public class circle_43
{
public static void main(String[]args)
	{ 	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Radius:");
		double r = keyboard.nextInt();
		
		print(calcArea(r));
	
	}
	public static double calcArea(double r) 
	{
		return 2*(3.14*r);
	}
	public static void print(double area)
	{
		System.out.println("The area of your circle is " + area);	
	}
}
	