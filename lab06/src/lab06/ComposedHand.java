package lab06;

import java.util.ArrayList;

public class ComposedHand {
	ArrayList<Card> cards = new ArrayList<Card>();
	private ComputationMethod method;
	
	public ComposedHand(ComputationMethod method) {
		this.method = method;
	}
	public void AddCard(Card c){
		cards.add(c);
	}
	public void clear(){
		cards.clear();
	}
	public String toString(){
		String returnVal = cards.toString();
		return returnVal;
	}
	public int value(){
		return method.compute(cards);
	}
}
