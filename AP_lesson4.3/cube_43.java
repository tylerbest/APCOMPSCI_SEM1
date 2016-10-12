import java.util.Scanner;
public class cube_43
{
public static void main(String[]args)
	{ 	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Side Length?");
		double s = keyboard.nextInt();
		
		print(calcSurf(s));
	
	}
	public static double calcSurf(double s) 
	{
		return 6*(s*s);
	}
	public static void print(double sa)
	{
		System.out.println("The surface area of your cube is " + sa);	
	}
}