public class honda extends car
{
	private double x;
	private double y;
	private double[] l;
	public honda()

	{
		x = 0;
		y = 0;
	}
	public honda(double[]loc)
	{
		l = loc;
		x = loc[0];
		y = loc[1];
	}
	public void move(double ex, double wy)
	{

		l[0] += ex;

		l[1] += wy;

	}
	public double[] getLoc()
	{
		return l;
	}
}
