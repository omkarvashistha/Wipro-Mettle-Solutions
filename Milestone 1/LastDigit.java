package WiproLogicBuilding;
import java.util.*;
public class LastDigit {
	public int lastDigit(int input) {
		/*--------------------------------To return last digit we must find the remainder of the input when divided my 10 this gives us last digit of any number---------------------------------------*/
		if(input>0){
			int last=(input%10);
			return last;
		}
		else {
			int last=(input%10);
			last=Math.abs(last); //This will give the absolute number because the numbers in negative will give negative number but we want positive number 
			return last;
		}
		
		//-----------------------------One Liner---------------------------------------------------------------------
		/*
		 return Math.abs(input%10);  This is the use of ternary operator  
		 																*/
	}
}
