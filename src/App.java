
public class App {

	public static void main(String[] args) {
		
		// instantiates new, ordered deck
		Deck playingDeck = new Deck();
		
		playingDeck.shuffle();
		playingDeck.describe();

		
		// instantiates two players
		Player p1 = new Player("One");
		p1.setHand(playingDeck.takeEvens() );
		p1.describe();
		
		Player p2 = new Player("Two");
		p2.setHand(playingDeck.takeOdds() );
		p2.describe();
		
		

	}

	
}
