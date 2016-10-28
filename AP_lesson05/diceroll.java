public class diceroll
{
	
	public static void main(String[]args)
	{
		int player = (int)(Math.random()*7)+1;
		int computer = (int)(Math.random()*7)+1;
		
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		
	
		if(computer > player);
			System.out.println("Computer Wins!");
		if(player > computer);
			System.out.println("Player Wins!");
	}
}