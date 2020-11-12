package WiproLogicBuilding;

public class SecondLastDigit {
	public int secondlastDigit(int input) {
		if(input>9 || input<-9) {
			int secLast=(input%100)/10;
			secLast=Math.abs(secLast); // Because we have to return digit as positive number
			return secLast;
		}
		else {  //If number is single digit
			return -1;
		}
		
		//-----------------------------One Liner---------------------------------------------------------------------
		/*
		 return (input1>9 || input1<-9) ? (Math.abs((input1%100)/10)) : -1;  This is the use of ternary operator  
		 																*/
	}
}
