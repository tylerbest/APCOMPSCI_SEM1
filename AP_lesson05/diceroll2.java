public class diceroll2
{
	static int player;
	static int computer;
	static String Winner;
	
	
	public static void main(String[]args)
	{
		player = (int)(Math.random()*7)+1;
		computer = (int)(Math.random()*7)+1;
		
		rollDice();
		
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("And the winner is " + winner); 
	}
	public static void rollDice()
	{	
		
		if(player > computer);
			  winner = player;
		if(computer > player)
			  winner = computer;
		if (player == computer)
			  winner = "What are the chances? It's a tie!";
		 
	}
}