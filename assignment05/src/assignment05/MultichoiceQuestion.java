package assignment05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MultichoiceQuestion extends Question {
	
	public MultichoiceQuestion(String questionText) {
		super(questionText);
		// TODO Auto-generated constructor stub
	}
	private ArrayList<String> choices = new ArrayList<String>();
	private ArrayList<Integer> correctChoices = new ArrayList<Integer>();
	/**
    Adds an answer choice to this question.
    @param choice the choice to add
    @param correct true if this is the correct choice, false otherwise
	 */
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct) {
			// Convert choices.size() to string
//			String choiceString = "" + choices.size();
//			setAnswer(choiceString);
			correctChoices.add(choices.size());
		}
	}
	@Override
	public void display() {
		// Display the question text
		super.display();
		// Display the answer choices
		for (int i = 0; i < choices.size(); i++) {
			int choiceNumber = i + 1;
			System.out.println(choiceNumber + ": " + choices.get(i));     
		}
	}
	@Override
	public String prompt(){
		return "Your answers "
				+ "(if more than one, separate "
				+ "answers by spaces): ";
	}
	public boolean checkAnswer(String response){
		boolean returnVal = false;
		int correct = 0;
		int incorrect = 0;
		Set <Integer> answers = new HashSet<>();
		//System.out.println(response); <--Passed
		
		try(Scanner scan = new Scanner(response)){
			//System.out.println(scan);
			while(scan.hasNextInt()){
				int ans = scan.nextInt();
				//System.out.println(ans);
				answers.add(ans);
			}
		}
		//System.out.println(answers.toString());
		for(int i : answers){
			if(correctChoices.contains(i)){
				correct++;
			}else{
				incorrect++;
			}
		}
		if((correct == correctChoices.size())&&(incorrect == 0)){
			returnVal = true;
		}
		System.out.println("Correct: "+correct+", Incorrect: "+ incorrect);
		return returnVal;
	}
	
	
	

}
