import java.util.List;

public class Player {
	
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		score = 0;
		System.out.println("New player created: " + name);
	}
	
	public void describe() {
		System.out.println("=======PLAYER INFO=======");
		System.out.println("Player name: " + name);
		System.out.println("Score: " + score);
		System.out.println("Hand: ");
		try {
			for (Card card : hand) {
			card.describe();
			}
		} catch (NullPointerException e){
			System.out.println("EMPTY");
		}
	}
	
	public void flip() {
		
	}
	
	public void draw() {
		
	}
	
	public void incrementScore() {
		
	}
	
	
	// getters/setters
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
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
