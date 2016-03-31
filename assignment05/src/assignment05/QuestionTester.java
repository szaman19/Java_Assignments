package assignment05;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionTester {

	@Test
	public void testCheckAnswerSingle() {
		ChoiceQuestion second = new ChoiceQuestion("In which country was the inventor of Java born?");
		second.addChoice("Australia", false);
		second.addChoice("Canada", true);
		second.addChoice("Denmark", false);
		second.addChoice("United States", false);
		assertTrue(second.checkAnswer("2"));
		assertFalse(second.checkAnswer("3"));
	}
	@Test
	public void testCheckAnswerMulti(){
		MultichoiceQuestion third = new MultichoiceQuestion("Which colleges are part of SUNY?");
		third.addChoice("Binghamton", true);
		third.addChoice("St. Bonaventure", false);
		third.addChoice("Stony Brook", true);
		third.addChoice("Elmira College", false);
		
		assertTrue(third.checkAnswer("1 3"));
		assertFalse(third.checkAnswer("1 2 3"));
		assertFalse(third.checkAnswer("1 2 3 4"));
		assertFalse(third.checkAnswer("1"));
		
	}
}
