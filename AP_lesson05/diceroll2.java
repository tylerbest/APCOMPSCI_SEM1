public class diceroll2
{
	
	public static void main(String[]args)
	{
		int player = (int)(Math.random()*7)+1;
		int computer = (int)(Math.random()*7)+1;
		
		String winner = winner;
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.ou.println("And the winner is " + winner); 
	}
	public static double diceRoll(int player, int computer)
	{	
		String winner = "";
		if(computer > player);
			winner = player;
		if(player < computer)
			winner = computer;
		return winner;
	}
}