import java.util.ArrayList;

public class Player extends Deck{
	
	private ArrayList<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		score = 0;
		
	}
	
	public void describe() {
		// prints info about the player and calls the describe method for each card in the hand
		
		System.out.println("=======PLAYER INFO=======");
		System.out.println("Player name: " + name);
		System.out.println("Score: " + score);
		System.out.println("Hand: ");
		try {
			int i = 1;
			for (Card card : hand) {
				System.out.print(i + "-");
				card.describe();
				i++;
			} // end of loop
			
		} catch (NullPointerException e) {
			System.out.println("-EMPTY-");
			
		} catch (Exception e) {
			System.out.println("Could not retrieve hand: " + e.toString() );
		}
		
	}
	
//	public Card flip() {
//		// removes and returns the top card of the hand
//		
//		
//	}
	
//	public void draw(Deck deck) {
//		// takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand
//		
//		
//	}
	
	public void incrementScore() {
		// adds 1 to the player's score
		
		score++;
	}
	
	
	// getters/setters
	public ArrayList<Card> getHand() {
		return hand;
	}
	public void setHand(ArrayList<Card> hand) {
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
