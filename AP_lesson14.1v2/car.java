public abstract class car implements Location 
{
	private double[] Location = new double[2];
	private final int ID = (int)(Math.random()*1000000);
	public car()
	{
		ID = (int)(Math.random()*1000000)+1;
		location = new double[2];
	}
	public double getID()
	{
		return ID;
	}
	public void move(double x, double y);
	
	public double[] getLoc()
	{
		return Location;
	}


}

