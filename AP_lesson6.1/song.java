public class song
{
	public static void main(String[]args)
	{
		sing("Na", 4);

		System.out.println("");

		sing("Na", 4);

		System.out.println("");

		sing("Hey", 3);

		System.out.println("");

		sing("Goodbye!", 1);

		System.out.println("");

	}

	public static void sing(String x, int y)

	{


		for(int i = 0; i < y; i++)


		{


			System.out.printf("%s ", x);


		}


	}


}


