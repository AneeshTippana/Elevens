/**
 * This is a class that tests the Card class.
 */
public class CardTester {
	

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card king = new Card("King", "spades", 10);
		Card ace = new Card("Ace", "clubs", 1);
		Card ten = new Card("Ten", "hearts", 10);
		Card king2 = new Card("King", "spades", 10);
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		System.out.println(king.matches(king2));
		System.out.println(ace.matches(ten));
		
		System.out.println(king.toString());
		System.out.println(ace.toString());
		System.out.println(ten.toString());
		
	}
}
