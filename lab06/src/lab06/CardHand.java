package lab06;

import java.util.ArrayList;

public abstract class CardHand {
	ArrayList<Card> cards = new ArrayList<Card>();
	public abstract int value();
	
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
}
