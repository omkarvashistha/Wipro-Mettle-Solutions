package WiproLogicBuilding;
import java.util.*;
public class IsOdd {
	public int isOdd(int input) {
		if(input%2!=0)/*This is the condition of being even number that is if a number is not divisible by 2*/ 
		{
			return 2;
		}
		else {
			return 1;
		}
		
		//-----------------------------One Liner---------------------------------------------------------------------
		/*
		 return (input%2!=0)?2:1  This is the use of ternary operator  
		 																*/
	}
}
