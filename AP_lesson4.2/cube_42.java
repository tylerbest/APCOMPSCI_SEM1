import java.util.Scanner;
public class cube_42
{
	static int s;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Side:");
		s = keyboard.nextInt();
		
		
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa = (6 * (s * s));
	}
	public static void print()
	{
		System.out.println("The surface area of a cube whose sides are " + s + " inches in length is: " + sa );
	}
}