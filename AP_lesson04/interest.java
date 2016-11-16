import java.util.Scanner;
public class interest
{
	public static void main(String[]args)
	{
		interest interest = new interest();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Interest rate:");
		double r = keyboard.nextDouble();
		System.out.println("Principal");
		double p = keyboard.nextDouble();
		System.out.println("Life of loan:");
		double t = keyboard.nextDouble();
		System.out.println("Number of times the loan is compounded per year:");
		double n = keyboard.nextDouble();
		
	
		System.out.printf("Your total monthly payment is $%.2f" + payment(r,p,t,n));
	
	}
	public double payment(double r, double p, double n, double t)
	{
		return p*(Math.pow(1+r/n, n*t))/(12*t);
	}
}