package assignment05;

public class QuestionDriver {

	public static void main(String[] args) {
		Question first = new Question("Who was the inventor of Java?");
		first.setAnswer("James Gosling");      

		ChoiceQuestion second = new ChoiceQuestion("In which country was the inventor of Java born?");
		second.addChoice("Australia", false);
		second.addChoice("Canada", true);
		second.addChoice("Denmark", false);
		second.addChoice("United States", false);

		MultichoiceQuestion third = new MultichoiceQuestion("Which colleges are part of SUNY?");
		third.addChoice("Binghamton", true);
		third.addChoice("St. Bonaventure", false);
		third.addChoice("Stony Brook", true);
		third.addChoice("Elmira College", false);
	      
		//first.presentQuestion();
		//second.presentQuestion();
		third.presentQuestion();
	   }

}
