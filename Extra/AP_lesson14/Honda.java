import java.util.Random;
public class Honda implements Location
{
	private double x, y; 
	private int ID;
	private double[] location;
	public Honda()
	{
		x = 0;
		y = 0;
	}
	public Honda(double X, double Y)
	{
		x = X;
		y = Y;
	}
	public void move (double X, double Y)
	{
		x += X;
		y += Y;
	}
	public int getID()
	{
		if(ID == 0)
		{
			ID = (int)(Math.random()*9999999) + 1;
		}
		return ID;
	}
	public double[] getLoc()
	{
		return location;
	}
}