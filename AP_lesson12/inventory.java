public class inventory
{
	private String manufacturer, name, category;
	private int UPC;
	private double price;
	public inventory()
	{
		manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price = 0;
	}
	public inventory(String m, String n)
	{
		manufacturer = m;
		name = n;
		category = "Unspecified";
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	public inventory(String m, String n, String c, double p)
	{
		manufacturer = m;
		name = n;
		category = c;
		UPC = (int)(Math.random() * 1000000000) + 1;
		price = p;
	}
	public String toString()
	{
		return "Item Info...\nItem Manufacturer: " + manufacturer +


								"\nItem Name: " + name +


								"\nItem Category: " + category +


								"\nUPC: " + UPC +


								"\nItem Price: " + price;


	}


}

