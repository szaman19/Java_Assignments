package lab06;

public class Card {
	public static enum Suit{Hearts,Diamonds,Clubs,Spades};
	private Suit suit;
	private int value;
	
	public Card(Suit suit, int value) {
		super();
		this.suit = suit;
		if(value < 2 || value > 11){
			throw new IllegalArgumentException("Incorrect input");
		}else{
			this.value = value;
		}
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object other){
		boolean returnVal = false;
		if(other instanceof Card){
			if (value == ((Card)(other)).getValue() && suit == ((Card)(other)).getSuit()){
				returnVal = true;
			}
		}
		return returnVal;
	}
	@Override
	public String toString(){
		String returnVal = "";
		if(value ==11){
			returnVal += "Ace";
		}
		else{
			returnVal += value;
		}
		returnVal += " of " + suit.toString();
		return returnVal;
	}
	@Override
	public int hashCode(){
		int returnVal = 31 * suit.hashCode() + value;
		return returnVal;
	}
	
	public static void main(String[] args){
		Card AceOfSpades = new Card(Suit.Spades,11);
		System.out.println(AceOfSpades);
		
		Card NineOfHearts = new Card(Suit.Hearts,9);
		System.out.println(NineOfHearts);
		
	}
	
	
	
}
