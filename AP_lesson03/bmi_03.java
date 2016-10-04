import java.util.Scanner; //import Statement

public class bmi_03
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please list your height in inches.");
		
		double height = keyboard.nextDouble();
		
		System.out.println("Please list your weight in pounds.");
		
		double weight = keyboard.nextDouble();
		double finalheight = height*height;
		double stuff = weight/finalheight;
		System.out.println("Your BMI is " +  stuff * 703);
		
		
	
	
	
	
	
	}
}