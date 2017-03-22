public class Honda implements Location
{
	private double[] location;
	public Honda(double[] locatioon;)
	{
		this.location = location;
	}
	public in getID()
	{
		Random rando = new Random();
		return rando.nextInt()\\addsometings
	}
	public void move(int x, int y)
	{
		location[1] = x;
		location[2] = y;
	}
	public double[] getLoc()
	{
		return location;
	}
}