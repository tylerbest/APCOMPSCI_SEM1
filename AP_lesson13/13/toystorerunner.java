public class toystorerunner
{
	public static void main(String[]args)
	{
		toystore store = new toystore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println("List...\n Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(store + "\n");
		System.out.println("Most frequent toy: " + store.getMostFrequentToy());
		System.out.println("Most frequent type of Toy; " + store.getMostFrequentType());
	}
}