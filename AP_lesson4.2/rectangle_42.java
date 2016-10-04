import java.util.Scanner;
public class rectangle_42
{
	static int l, w;
	static int perimeter;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Length");
		l = keyboard.nextInt();
		System.out.println("Width");
		w = keyboard.nextInt();
		
		calcPerim();
		print();
	}
	public static void calcPerim()
	{
		perimeter = 2 * (l + w);
	}
	public static void print()
	{
		System.out.println("The Perimeter of the rectangle is " + perimeter);
	}
}
