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
		int i = 0;
		for (Card card : cards) {
			i++;
			System.out.print(i + "-");
			card.describe();
			
		}
	}
	
	public void shuffle() {
		// shuffles order or cards in deck
		
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
		// removes the card at the top of the deck and returns the drawn card
		
		Card drawnCard = cards.get(0);
		cards.remove(0);
		
		return drawnCard;
		
	}
	
	public ArrayList<Card> takeEvens() {
		// returns a deck with all the even-indexed cards
		
		ArrayList<Card> evenCards = new ArrayList<Card>();
		
		for (int i = 0; i < cards.size(); i++) {
			if (i % 2 == 0) {
				evenCards.add(cards.get(i) );
			}
		}
		
		return evenCards;
	}
	
	public ArrayList<Card> takeOdds() {
		// returns a deck with all the odd-indexed cards
		
		ArrayList<Card> oddCards = new ArrayList<Card>();
		
		for (int i = 0; i < cards.size(); i++) {
			if (i % 2 != 0) {
				oddCards.add(cards.get(i) );
			}
		}
		
		return oddCards;
	}

}
