import java.util.Scanner;
public class average_43
{
public static void main(String[]args)
	{ 	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Number 1?");
		double num1 = keyboard.nextInt();
		System.out.println("Number 2?");
		double num2 = keyboard.nextInt();
		System.out.println("Number 3?");
		double num3 = keyboard.nextInt();
		print (average(num1, num2, num3));
	}
	public static double average(double num1, double num2, double num3)
	{
		return (num1*num2*num3)/3;
	}
	public static void print(double average)
	{
		System.out.println("The average of number 1, number 2, and number 3 is " + average);
	}
}