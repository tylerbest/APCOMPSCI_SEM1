import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class gamehealth
{
	static int HEALTHLOAD = 6;
	static String[] health = new String[HEALTHLOAD];
	static int healthCount;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		while(!turn.equals("Q") && healthCount > 0)


		{
			System.out.println("Hit ENTER when you are ready:");
			turn = kb.nextLine();
			damage = (int)(Math.random()*2)+1;
			amount = (int)(Math.random()*6)+1;
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You got GOT!");
	}
	public static String takeDamage(int d, int a)
	{
		if(d == 1)
		{
			healthCount = healthCount - a;
			return "You took " + a + " damage!";
		}
		else if(healthCount + a < HEALTHLOAD)
		{
			healthCount = healthCount + a;
		}
		else
		{
			healthCount = HEALTHLOAD;
		}
		return "HP Up " + a + "!";
	}
	public static void printClip()
	{
		String output = "Health: \t";
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthCount)
			{
				health[i] = "@";
			}
			else
			{
				health[i] = "[]";
			}
			output = output + health[i];
		}
		System.out.println(output);
	}
}

