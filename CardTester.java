 /**

* This is a class that tests the Card class.
*/
public class CardTester
{
 
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
 
	public static void main(String[] args)
	{
		Card fourhearts = new Card("Four", "Hearts", 4);
		Card twodiamonds = new Card("Two", "Diamonds", 2);
 		Card ninespades = new Card("Nine", "Spades", 9);
 
	System.out.println("Four of Hearts equal to the Two of Diamonds? " + fourhearts.matches(twodiamonds));
	System.out.println("Four of Hearts equal to the Nine of Spades? " + fourhearts.matches(ninespades));   
	System.out.println("Two of Diamonds equal to the Nine of Spades? " + twodiamonds.matches(ninespades)); 
	System.out.println("Four of Hearts equal to the Four of Hearts? " + fourhearts.matches(fourhearts));       	
	
	System.out.println("Card 1: " + fourhearts.toString());
	System.out.println("Card 2: " + twodiamonds.toString());
	System.out.println("Card 3: " + ninespades.toString());
	}
 
}
 
