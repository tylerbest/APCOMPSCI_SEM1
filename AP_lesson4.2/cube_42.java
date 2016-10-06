import java.util.Scanner;
public class cube_42
{
	static int side;
	static int sa;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Side:");
		s = keyboard.nextInt();
		
		
		print();
		calcSurf();
	}
	public static void calcSurf()
	{
		sa = 6 * math.pow s, 2;
	}
	public static void print()
	{
		System.out.println("The surface area of a cube whose sides are " + s + "in length is " + sa);
	}
}