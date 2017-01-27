import static java.lang.Math.*;
import java.util.Scanner;
public class milesperhour

{
	private int distance, hours, minutes;
	private double mph;
	public milesperhour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	public milesperhour(int dist, int hrs, int min, double mph)
	{
		distance = dist;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	public void setDistance(int dist)
	{
		distance = dist;

	}
	public void setHours(int hrs)
	{
		hours = hrs;
	}
	public void setMinutes(int min)
	{
		minutes = min;
	}
	public void setMPH(double mph)
	{
		mph = 0;
	}
	public int getDistance()
	{
		return distance;
	}
	public int getHours()
	{
		return hours;
	}
	public int getMinutes()
	{
		return minutes;
	}
	public double getMph()
	{
		return mph = Math.round(distance /(((hours * 60) + minutes) / 60));
	}
	
}