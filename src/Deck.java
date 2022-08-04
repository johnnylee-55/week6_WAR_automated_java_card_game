import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	// fields
	private ArrayList<Card> cards;
	
	
	// constructor
	public Deck() {
		// creates an new, ordered deck upon construction
		cards = new ArrayList<Card>();
		
		for (Suit suit : Suit.values() ) {
			for (Value value : Value.values() ) {
				cards.add(new Card(value, suit) );
			}
		} // end of loop
	}
	
	
	// methods
	public void describe() {  
		System.out.println("====PLAYING DECK====");
		
		int i = 0;
		for (Card card : cards) {
			i++;
			System.out.print(i + "-");
			card.describe();		
		}
	} // *note* this method is not used in the application.
	  //        it is only used to print a specific output for assignment submission.
	
	
	public void shuffle() {
		// shuffles order of cards in deck
	
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
	
	
	public Card draw() {
		// removes and returns the top card of the Cards field
		Card drawnCard = cards.get(0);
		cards.remove(0);
		
		return drawnCard;
	}
}
