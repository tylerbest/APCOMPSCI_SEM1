public class GameSystem
{
	private String platform;
	private int serialNo;
	public GameSystem()
	{
		platform = "";
		serialNo = (int)(Math.random()*9999999) + 1;
	}
	
	public GameSystem(String p)
	

	{
		platform = p;
		serialNo = (int)(Math.random()*9999999) + 1;
	}
	public void setPlatform(String p)
	{
		platform = p;
	}
	public String getPlatform()
	{
		return platform;
	}	
	public int getserialNo()
	{
		return serialNo;
	}
	
}