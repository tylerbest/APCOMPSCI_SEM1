import java.util.Random;
public class GMC
{
	private double x, y;
	public GMC()
	{
		x = 0;
		y = 0;
	}
	public GMC(double 1x, double 1y)
	{
		x = 1x;
		y = 1y;
	}	
	public void move(double 1x, double 1y)
	{
		x += 1x;
		y += 1y;
	}
	public double getLoc()
	{
		double location = (x,y);
		return location;
	}
}