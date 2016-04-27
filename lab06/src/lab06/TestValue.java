package lab06;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestValue {

	@Test
	public void testOne() {
		Card four = new Card(Card.Suit.Clubs,4);
		Card two = new Card(Card.Suit.Clubs,2);
		Card ten = new Card(Card.Suit.Clubs,10);
		Card ace = new Card(Card.Suit.Clubs,11);
		
		BlackjackHand handOne = new BlackjackHand();
		
		handOne.AddCard(four);
		handOne.AddCard(two);
		assertEquals(6,handOne.value());
		handOne.clear();
	}
	@Test
	public void testTwo(){
		Card four = new Card(Card.Suit.Clubs,4);
		Card two = new Card(Card.Suit.Clubs,2);
		Card ten = new Card(Card.Suit.Clubs,10);
		Card ace = new Card(Card.Suit.Clubs,11);
		
		BlackjackHand handOne = new BlackjackHand();
		handOne.AddCard(ace);
		handOne.AddCard(ten);
		assertEquals(21,handOne.value());
		handOne.clear();
	}
	@Test
	public void testThree(){
		Card four = new Card(Card.Suit.Clubs,4);
		Card two = new Card(Card.Suit.Clubs,2);
		Card ten = new Card(Card.Suit.Clubs,10);
		Card ace = new Card(Card.Suit.Clubs,11);
		
		BlackjackHand handOne = new BlackjackHand();
		
		handOne.AddCard(ace);
		handOne.AddCard(ace);
		assertEquals(12,handOne.value());
		handOne.clear();
		
	}
	@Test
	public void testFour(){
		Card four = new Card(Card.Suit.Clubs,4);
		Card two = new Card(Card.Suit.Clubs,2);
		Card ten = new Card(Card.Suit.Clubs,10);
		Card ace = new Card(Card.Suit.Clubs,11);
		
		BlackjackHand handOne = new BlackjackHand();
		
		handOne.AddCard(ace);
		handOne.AddCard(ace);
		handOne.AddCard(ace);
		assertEquals(13,handOne.value());
		handOne.clear();
		
	}
	@Test
	public void testFive(){
		Card four = new Card(Card.Suit.Clubs,4);
		Card two = new Card(Card.Suit.Clubs,2);
		Card ten = new Card(Card.Suit.Clubs,10);
		Card ace = new Card(Card.Suit.Clubs,11);
		
		BlackjackHand handOne = new BlackjackHand();
		
		handOne.AddCard(ten);
		handOne.AddCard(ten);
		handOne.AddCard(two);
		assertEquals(22,handOne.value());
		handOne.clear();
		
	}
	@Test
	public void testSix(){
		Card four = new Card(Card.Suit.Clubs,4);
		Card two = new Card(Card.Suit.Clubs,2);
		Card ten = new Card(Card.Suit.Clubs,10);
		Card ace = new Card(Card.Suit.Clubs,11);
		
		BlackjackHand handOne = new BlackjackHand();
		
		handOne.AddCard(ten);
		handOne.AddCard(ten);
		handOne.AddCard(ace);
		assertEquals(21,handOne.value());
		
	}

}
