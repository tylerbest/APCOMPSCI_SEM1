import java.util.ArrayList;
import java.lang.Math.*;
public class gmc extends car
{
	private double xx, yy;
	public gmc()
	{
		xx = 0;
		yy = 0;
	}
	public gmc(double x,double y)
	{
		super();
		xx = x;
		yy = y;
	}
	public void move(double x,double y)
	{
		this.xx += x;
		this.yy += y;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = xx;
		location[1] = yy;
		return location;
	}
}

