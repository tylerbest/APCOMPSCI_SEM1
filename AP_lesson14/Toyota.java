import java.util.Random;
public class Toyota implements Location
{
	private double x, y; 
	private int ID;
	private double [] location;
	public Toyota()
	{
		location = new double [2];
	}
	public Toyota(String coordinates)
	{
		location = new double[2];
		String[] c = coordinates.split(", ");
		location[0] = Double.parseDouble(c[0]);
		location[1] = Double.parseDouble(c[1]);
	}
	public int getID()
	{
		if(ID == 0)
		{
			ID = (int)(Math.random()*9999999) + 1;
		}
		return ID;
	}
	public void move(int x, int y)
	{
		location[0] += x;
		location[1] += y;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}
}