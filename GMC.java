import java.util.Random;
public class GMC implements Location
{
	private double x, y;
	private int ID;
	
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
	public int getID()
	{
		if(ID == 0)
		{
			ID = (int)(Math.random()*9999999) + 1;
		}
		return ID;
	}
	public double getLoc()
	{
		double location = (x,y);
		return location;
	}
}