import java.util.Random;
public class Honda implements Location
{
	private double x, y; 
	private int ID;
	private double [] location;
	public Honda()
	{
		location = new double [2];
	}
	public Honda(double[] loc)
	{
		location = loc;
	}
	public void move (double X, double Y)
	{
		location[0] += X;
		location[1] += Y;
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