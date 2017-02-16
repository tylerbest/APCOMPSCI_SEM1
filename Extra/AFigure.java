public class AFigure extends toyclass
{
	private String type;
	
	public AFigure()
	{
		super();
		type = "";
	}
	
	public AFigure(String n)
	{
		super(n);
		type = "AFigure";
	}
	
	public String getType()
	{
		return type;
	}
	
	public String toString()
	{
		return super.toString() + " "+ type;
	}
}