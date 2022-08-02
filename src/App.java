import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		// instantiates new, ordered deck
		Deck playingDeck = new Deck();
		
		// shuffles and deals deck to two players
		playingDeck.shuffle();
		Deck player1Deck = playingDeck.splitDeckEvens();
		Deck player2Deck = playingDeck.splitDeckOdds();
		
		
		Player p1 = new Player("One");
		p1.describe();
		p1.draw(player1Deck);
		p1.describe();
		
		Player p2 = new Player("Two");
		p2.describe();
		

	}
	
}
