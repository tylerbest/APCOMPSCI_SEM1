import java.lang.Math.*;
public class distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	public distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	public distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		distance = 0;
	}
	public void setXOne(int x1)
	{
		xOne = x1;
	}
	public void setYOne(int y1)
	{
		yOne = y1;
	}
	public void setXTwo(int x2)
	{
		xTwo = x2;
	}
	public void setYTwo(int y2)
	{
		yTwo = y2;
	}
	public double getDist()
	{
		return Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
	}
}

