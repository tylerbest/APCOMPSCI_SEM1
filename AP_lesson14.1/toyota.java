import java.util.Arrays;
public class toyota extends car
{
	private double[] loc;
	private double x;
	private double y;
	public toyota()
	{
		x = 0;

		y = 0;
		
	}
	public toyota(String i)
	{
		String[] locs = i.split(", ");
		x = Double.parseDouble(locs[0]);
		y = Double.parseDouble(locs[1]);
	}
	public void move(double ex, double wy)
	{
		x += ex;
		y += wy;
	}

	public double[] getLoc()

	{
		return new double[] {x,y};
	}


}

