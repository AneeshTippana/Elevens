/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"queen", "king", "jack", "ace", "ten", "nine", "eight", "seven", "six", "five", "four", "three", "two"};
		String[] suits = {"spades", "hearts", "clubs", "diamonds"};
		int[] values = {10, 10, 10, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
		
		Deck dec = new Deck(ranks, suits, values);
		
		System.out.println(dec.size());
		System.out.println(dec.deal());
	}
}
