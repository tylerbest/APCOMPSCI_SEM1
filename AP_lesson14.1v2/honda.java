public class honda extends car
{
	
	private double xx, yy;
	private int ID;
	public honda()
	{
		xx = 0;
		yy = 0;
	}
	public honda(double[] l)
	{
		super();
		ID = (int)(Math.random()*1000000)+1;
		xx = l[0];
		yy = l[0];
	}
	public int getID()
	{
		return ID;
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

