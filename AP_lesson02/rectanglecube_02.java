public class rectanglecube_02
{
	public static void main(String[]args)
	{
		int l = 4;
		int w = 3;
		int h = 8;
		int x = 2;
		int sa = x*w*l+x*l*h+x*h*w;
		
		System.out.println("The surface area of your rectangle is  " + sa);
	}
}	