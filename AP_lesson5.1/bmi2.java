import java.util.Scanner;
public class bmi2
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Enter your weight in lbs");
		double weight = kb.nextDouble();
		
		System.out.println("Enter your height in inches");
		double height = kb.nextDouble();
		
		double bmi = weight/Math.pow(height, 2)*703;
		print(bmi, calcCondish(bmi));
	
	}
	public static String calcCondish(double bmi)
	{
		String output = "output";
		if (bmi >39.9)
			return "Morbidly obese";
		else if (bmi>= 35)
			return "Very obese";
		else if (bmi>= 29.9)
			return "obese";
		else if (bmi >= 25)
			return "overweight";
		else if (bmi >= 18.5)
			return "normal";
		if (bmi >18.5)
			return "underwieght";
		
		return output;
	}
	public static void print (double bmi, String output)
	{
		System.out.printf("Your BMI is %.1f.\n You are %s.",bmi,output);
	}
		
		
}