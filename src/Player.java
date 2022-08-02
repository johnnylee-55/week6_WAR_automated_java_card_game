import java.util.ArrayList;

public class Player {
	private Deck hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		score = 0;
		Deck hand = new Deck();
		
	}
	
	public void describe() {
		// prints info about the player and calls the describe method for each card in the hand
		
		System.out.println("=======PLAYER INFO=======");
		System.out.println("Player name: " + name);
		System.out.println("Score: " + score);
		System.out.println("Hand: ");
		try {
			for (Card card : hand.cards) {
			card.describe();
			}
		} catch (NullPointerException e){
			System.out.println("EMPTY");
		}
	}
	
	public Card flip() {
		// removes and returns the top card of the hand
		
		Card flippedCard = hand.get(0);
		hand.remove(0);
		
		return flippedCard;
	}
	
	public void draw(Deck deck) {
		// takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand
		
		hand.cards.add(deck.draw() );
	}
	
	public void incrementScore() {
		// adds 1 to the player's score
		
		score++;
	}
	
	
	// getters/setters
	public Deck getHand() {
		return hand;
	}
	public void setHand(Deck hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
