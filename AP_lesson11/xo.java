public class xo
{
	public static void main(String[]args)
	{
		String[][] xo = new String[4][4];
		for(int i = 0; i < xo.length; i++)
		{
			for(int j = 0; j < xo[i].length; j++)
			{
				int pick = (int)(Math.random() * 2)+1;
				if(pick == 1)
				{
					xo[i][j] = "x";
				}
				if(pick == 2)
				{
					xo[i][j] = "o";
				}
				System.out.print(xo[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

