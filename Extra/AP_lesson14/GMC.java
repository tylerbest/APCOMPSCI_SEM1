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
	public GMC(double X, double Y)
	{
		x = X;
		y = Y;
	}	
	public void move(double ex, double wy)
	{
		x += ex;
		y += wy;
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
		double[]Location =  new double[2];
		Location[0] = x;
		Location[1] = y;
		
		return Location;
	}
}