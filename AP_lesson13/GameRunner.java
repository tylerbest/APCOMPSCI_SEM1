
public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem Plus = new XBox("XBOX One");
		GameSystem Crazy = new PlayStation("PlayStation 4");
		GameSystem Pro = new PC("Asus Desktop");
		System.out.println(Plus + "\n");
		System.out.println(Crazy + "\n");
		System.out.println(Pro + "\n");
	}
}
