package lab06;

public class BlackjackHand extends CardHand {

	@Override
	public int value() {
		// TODO Auto-generated method stub
		int returnVal = 0;
		for(Card C: cards){
			if(C.getValue() != 11){
				returnVal += C.getValue();
			}
		}
		for (Card A: cards){
			
			if (A.getValue() ==11){
				if(returnVal + 11 <= 21){
					returnVal += 11;
				}else{
					returnVal += 1;
				}	
			}
		}
		return returnVal;
	}

}
