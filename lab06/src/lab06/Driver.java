package lab06;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card four = new Card(Card.Suit.Clubs,4);
		Card two = new Card(Card.Suit.Clubs,2);
		Card ten = new Card(Card.Suit.Clubs,10);
		Card ace = new Card(Card.Suit.Clubs,11);
		
		BlackjackMethod blackJackMethod = new BlackjackMethod();
		ComposedHand handOne = new ComposedHand(blackJackMethod);
		handOne.AddCard(four);
		handOne.AddCard(two);
		System.out.println(handOne.value());
		handOne.clear();
		handOne.AddCard(ten);
		System.out.println(handOne.value());
		handOne.AddCard(ace);
		System.out.println(handOne.value());
		System.out.println(handOne);

	}

}
