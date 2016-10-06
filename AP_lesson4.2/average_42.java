import java.util.Scanner;
public class average_42
{
	static int num1, num2, num3;
	static int avg;
	
	public static void main(String[]args)
	{
		average_42 form = new average_42();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is number 1?");
		num1 = keyboard.nextInt();
		System.out.println("What is number 2?");
		num2 = keyboard.nextInt();
		System.out.println("What is number 3?");
		num3 = keyboard.nextInt();
		double avg;
		
		calcAvg();
		print();
	}
	public static void calcAvg()
	{
		avg = (num1 + num2 + num3)/3;
	}
	public static void print()
	{
		System.out.println("The average is " +  avg);
	}
}