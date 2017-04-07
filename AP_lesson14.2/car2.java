public class car2 implements location2 
{

	private double[] Location = new double[2];
	private double ID;
	public car2()
	{
		ID = (int)(Math.random()*1000000)+1;
		location = new double[2];
	}

	public void move(double x, double y)
	{
		Location[0] += x;
		Location[1] += y;
	}
	public double[] getLoc()
	{
		return Location;
	}
}