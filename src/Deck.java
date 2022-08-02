import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	// fields
	private ArrayList<Card> cards;
	
	
	// constructor
	public Deck() {
		
		// creates an new, ordered deck
		cards = new ArrayList<Card>();
		
		for (Suit suit : Suit.values() ) {
			for (Value value : Value.values() ) {
				cards.add(new Card(value, suit) );
			}
		} // end of loop
	}
	
	
	// methods
	public void checkDeck() {  // testingMethod
		int i = 0;
		for (Card card : cards) {
			i++;
			System.out.print(i + "-");
			card.describe();
			
		}
	}
	
	public void shuffle() {
		
		Card tempCard;
		Random r = new Random();
		
		for (int i = 0; i < cards.size(); i++) {
			
			// generate random index
			int randIndex = r.nextInt(51);
			
			// swaps card at index i with card at randIndex
			tempCard = cards.get(i);
			cards.set(i, cards.get(randIndex) );
			cards.set(randIndex, tempCard);
			
		} // end of loop
		
	}
	
	public void draw() {
		
	}

}
