public class GMC
{
	private int serialNo;
	
	public GMC()
	{
		serialNo = (int)(Math.random()*9999999)+1;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}