public class getodds
{
	static int[]numbers = new int[10];
	public static void main(String[]args)

	{
		fillArray();

		printArray();

		System.out.println("\nThere are " + getodds() + " odd numbers");
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
		for(int number : numbers)
		{
			System.out.print(number + " ");
		}
	}
	
	public static int getodds()

	{

		int odds = 0;
		for(int number : numbers)
		{
			if(number % 2 != 0)
			{
				odds++;
			}
		}
		return odds;
	}
}

