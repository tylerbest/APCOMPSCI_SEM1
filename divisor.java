import java.util.Scanner;
public class divisor
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[][] nums = new int[4][4];
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)(Math.random() * 100) + 1;
				System.out.print(nums[i][j]);
			}
			System.out.println();
		}
		System.out.println("Please enter a number:");
		int divsor = kb.nextInt();
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				if(nums[i][j] % divsor == 0)
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " numbers divisible by " + divsor + " in the Array");
	}
}

