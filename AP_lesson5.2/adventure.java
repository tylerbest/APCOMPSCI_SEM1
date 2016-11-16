import java.util.Scanner;
public class adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Do you want to go on an adventure? (y or n)");
		String choice = kb.next();
	
	 if (choice.equals("y"))
		{
			System.out.println("Would you like to be a..."+
							"\n 1. Fighter"+
							"\n 2. Wizard");
			int choice1 = kb.nextInt();
			
			if (choice1 == 1)
			{
				System.out.println("What would you like to wield great Warrior?"+
								"\n 1. Battleaxe"+ 
								"\n 2. Staff");
				int choice2 = kb.nextInt();
				if (choice2 == 1)
				{
					System.out.println("The Battleaxe is a mighty weapon well suited for the warrior");
				}
				else
				{
					System.out.println("The Staff is a tricky weapon well suited for the wise Wizard");
				}
			}
			else
			{
				System.out.println("What would you like to wield great Wizard?"+
								"\n 1. Battleaxe"+ 
								"\n 2. Staff");
						int choice2 = kb.nextInt();
				if (choice2 == 1)
				{
					System.out.println("The Battleaxe is a mighty weapon well suited for the warrior");
				}
				else
				{
					System.out.println("The Staff is a tricky weapon well suited for the wise Wizard");
				}
			}	
		}
	else 
		{
			System.out.println("Continue on with your boring life"+
									"\n 1. Go to Work"+
									"\n 2. Go Home");
			int choice3 = kb.nextInt();
			
			if (choice3 == 1)
			{
				System.out.println("You do some paperwork thinking about how you could have been on an adventure");	
			}
			else
			{
					System.out.println("You watch a movie while thinking about how you could have been on an adventure");
			}
		
		}
	}
}