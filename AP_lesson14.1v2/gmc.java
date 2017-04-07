public class gmc extends car
{
	private double xx, yy;
	private int ID;
	public gmc()
	{
		xx = 0;
		yy = 0;
	}
	public gmc(int x,int y)
	{
		ID = (int)(Math.random()*1000000)+1;
		xx = x;
		yy = y;
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

