import java.util.Arrays;
import java.util.ArrayList;

public class toystore
{
	public ArrayList <toy> toyList;
	public toystore()
	{
	
		toyList = new ArrayList<>();
	}
	public toystore(String t)
	{
		toyList = new ArrayList<>();
		loadToys(t);
		
	}
	public ArrayList <toy> loadToys(String ts)
	{
		ArrayList <String> toys = new ArrayList <String> (Arrays.asList(ts.split(", ")));
		toyList = new ArrayList <toy>();
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i); 
			String type = toys.get (i + 1); 
			toy t = getThatToy(name);
			if(t == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new car(name));
				}
				if(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
				t.setCount(t.getCount() + 1);
		}
		return toyList;
	}
	
	public toy getThatToy(String nm)
	{
		for(toy x : toyList)
		{
			if(x.getName().equals(nm))
			{
				return x;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(toy x : toyList)
		{
			if(max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(toy x : toyList)
		{
			if(x.getType().equals("Car"))
				cars++;
			if(x.getType().equals("AF"))
				figures++;
		}
		
		if(cars > figures)
		{
			return "Cars";
		}
		if(figures < cars)
		{
			return "Action Figures";
		}
		else
		{
			return "Equal amounts of action figures and cars!";
		}
	}
	
	public String toString()
	{
		return toyList.toString();
	}
}
	
	
		
	

	