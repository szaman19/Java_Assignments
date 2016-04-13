package assignment08;

import java.util.Random;

public class Question3 {
	public static double squareRootGuess(double x, double g){
		if (x < 0){
			throw new IllegalArgumentException();
		} else if (x == 0){
			return 0;
		}else{
			if(Math.abs((g*g) - x) < 1E-10){
				return g;
			}else{
				return squareRootGuess(x,((g + (x / g))/2));
			}
		}
	}
	
	public static double squareRoot(double x){
		Random ran = new Random();
		double g = x * ran.nextDouble();
		double returnVal = squareRootGuess(x,g);
		return returnVal;
	}
	
	public static void main(String [] args){
		double four = 4.0;
		System.out.println(squareRoot(four));
		
		double test = 36.0;
		System.out.print(squareRoot(test));
	}
}
