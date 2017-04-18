public class toyota2 extends car2
{
	private double[] location;
	public toyota2()
	{
		location = new double[2];
	}
	public toyota2(String l)
	{

		location = new double[2];
		String[] locations = l.split(", ");
		location[0] = Double.parseDouble(locations[0]);
		location[1] = Double.parseDouble(locations[1]);
	}
}
