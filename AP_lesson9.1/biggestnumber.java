public class biggestnumber
{
	static int[]numbers = new int[10];
	public static void main(String[]args)
	{
		fillArray();
		printArray();
		System.out.println("\nThe biggest number is " + getbiggest());
	}
	public static void fillArray()
	{
		for(int i =0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;

		}
	}

	public static void printArray()

	{
		System.out.println("For the following numbers...");
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
	}
	public static int getbiggest()
	{
		int max = 0;
		for(int num : numbers)
		{
			if(num > max)
			{
				max = num;
			}
		}
		return max;
	}

}

