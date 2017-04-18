public class gmc extends car
{
	private double x;
	private double y;
	public gmc()
	{
		x = 0;
		y = 0;
	}
	public gmc(double ex, double wy)
	{
		x += ex;
		y += wy;
	}
	public void move(double ex, double wy)
	{
		x += ex;
		y += wy;
	}
	public double[] getLoc()
	{
		double[] loc = new double[] {x,y};
		return loc;

	}

}

