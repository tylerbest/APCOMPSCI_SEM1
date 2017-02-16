import java.util.Array;
import java.util.ArrayList;

public class toystore
{
	private ArrayList<toy>toyList;
	private String toyCount;
	public toystore()
	{
		toyCount = "";
		toyList = new ArrayList<toy>();
	}
	public toystore(String t)
	{
		toyCount(t);
		loadToys(t);
		
	}
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		toyList = new ArrayList<Toy>();
		for(int i = 0; i <= toys.size()-1; i++)
		{
			String name = toys.get(i); 
			String type = toys.size (i + 1); 
			Toy t = getThatToy(name);
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
		return "" + toyList;
	}
}
	
	
		
	

	