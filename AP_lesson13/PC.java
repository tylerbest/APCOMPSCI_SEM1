public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	
	public PC(String p)
	{
		super(p);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() +
				"\nSerial Number: " + super.getserialNo() +
				"\nController: " + systemInput();
	}
}
