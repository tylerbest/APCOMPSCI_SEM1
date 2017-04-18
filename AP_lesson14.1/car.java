public abstract class car implements Location
{
	public int ID =(int)(Math.random() * 9999999) + 1;
	public int getID()
	
	{
		return ID;
	}
	
	public abstract double[] getLoc();
	abstract void move(double ex, double wy);

}

