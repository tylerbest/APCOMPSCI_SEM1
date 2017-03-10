public class XBox extends Console
{
	private String type;
	
	public XBox()
	{
		super();
	}
	
	public XBox(String p)
	{
		super(p);
	}
	
	public String getController()
	{
		return "XBOX Wireless Controller";
	}
	public String getPlatform()
	{
		return "XBox";
	}
}