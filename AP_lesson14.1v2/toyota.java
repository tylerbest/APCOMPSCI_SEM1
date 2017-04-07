import java.util.*;
public class toyota extends car
{
	private double xx, yy ;
	private int ID;
	public toyota(String l)
	{
		ID = (int)(Math.random()*1000000)+1;
		ArrayList<String> loc = new ArrayList<String>(Arrays.asList(l.split(", ")));
		double x = Double.parseDouble(loc.get(0));
		double y = Double.parseDouble(loc.get(1));
		move(x,y);
	}
	public int getID()
	{
		return ID;
	}
	public void move(double x,double y)
	{
		xx += x;
		yy += y;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = xx;
		location[1] = yy;
		return location;
	}
	
}

