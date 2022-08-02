
public class Card {
	
	// fields
	private Value value;
	private Suit suit; 
	private String name;
	
	
	// constructor
	public Card(Value value, Suit suit) {
		this.value = value;
		this.suit = suit;
		name = value + " of " + suit;
	}
	
	
	// methods
	public void describe() {
		System.out.println(name);
	}
	

	// getters/setters
	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	

}
