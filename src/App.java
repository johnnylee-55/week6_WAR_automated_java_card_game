
public class App {

	public static void main(String[] args) {
		
		// welcome message
		System.out.println("Welcome to WAR!\n");
		
		// instantiates new, ordered deck
		Deck playingDeck = new Deck();
		
		// shuffles the deck
		System.out.println("Shuffling deck...");
		playingDeck.shuffle();
		
		
		// instantiates two players
		Player p1 = new Player("One");
		Player p2 = new Player("Two");
		System.out.println("Welcome players! " + p1.getName() + ", " + p2.getName() );
		
		
		// each player takes turns taking cards from the top of the playing deck
		System.out.println("Players, take turns taking cards from the deck.");
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.draw(playingDeck);
				System.out.println(p1.getName() + " took a card.");
			}
			if (i % 2 != 0) {
				p2.draw(playingDeck);
				System.out.println(p2.getName() + " took a card.");
			}
		}
		
		
		// game loop - iterates 26 times
		for (int i = 1; i <= 26; i++) {
			
			System.out.println("====ROUND " + i + "=========================");
			
			System.out.print(p1.getName() + " flipped over: ");
			Card p1card = p1.flip();
			p1card.describe();
			
			System.out.print(p2.getName() + " flipped over: ");
			Card p2card = p2.flip();
			p2card.describe();
			
			// decides winner of each round
			if (judge(p1card, p2card) == 1) {
				System.out.println(p1.getName() + " wins the round.\n");
				p1.incrementScore();
			} else if (judge(p1card, p2card) == 2) {
				System.out.println(p2.getName() + " wins the round.\n");
				p2.incrementScore();
			} else {
				System.out.println("Draw - no point awarded.");
			}
		} // end of loop
		
		
		// end of game message
		System.out.println("==========GAME OVER==========");
		System.out.println(p1.getName() + "'s final score: " + p1.getScore() );
		System.out.println(p2.getName() + "'s final score: " + p2.getScore() );
		
		
		// print game winner
		if (p1.getScore() > p2.getScore() ) {
			System.out.println("\nRESULTS: " + p1.getName() + " wins!");
			
		} else if (p1.getScore() < p2.getScore() ) {
			System.out.println("\nRESULTS: " + p2.getName() + " wins!");
			
		} else {
			System.out.println("\nRESULTS: DRAW!");
		}
		
		
		// end message
		System.out.println("Thank you for playing!");
	}
	
	
	public static int judge(Card p1card, Card p2card) {
		// returns 1 if p1 wins, returns 2 if p2 wins, returns 3 if draw
		
		if (getValue(p1card) > getValue(p2card) ) {
			return 1; // p1 win
			
		} else if (getValue(p1card) < getValue(p2card) ) {
			return 2; // p2 win
			
		} else {
			return 3; // draw
		}
	}
	
	
	public static int getValue(Card card) {
		// returns a card's corresponding value
		
		switch (card.getValue() ) {
			case TWO: return 2;
			case THREE: return 3;
			case FOUR: return 4;
			case FIVE: return 5;
			case SIX: return 6;
			case SEVEN: return 7;
			case EIGHT: return 8;
			case NINE: return 9;
			case TEN: return 10;
			case JACK: return 11;
			case QUEEN: return 12;
			case KING: return 13;
			case ACE: return 14;
			default: return 0;
		}
	}
	
}
