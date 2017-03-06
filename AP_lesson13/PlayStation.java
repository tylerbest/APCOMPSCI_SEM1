public class PlayStation extends Console
{
	private String type;
	
	public PlayStation()
	{
		super();
	}
	
	public PlayStation(String p)
	{
		super(p);
	}
	
	public String getController()
	{
		return "PS DualShock 3";
	}
	public String getPlatform()
	{
		return "PlayStation";
	}
}