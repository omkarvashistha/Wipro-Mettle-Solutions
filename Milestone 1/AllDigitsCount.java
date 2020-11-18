package WiproLogicBuilding;

public class AllDigitsCount {
	public int allDigitsCount(int input1) {
		int count=0;
		while(input1>0) {  // This is the condition to check the number of digits of integer and by this we can also take every digit of number
			count++;
			input1/=10;
		}
		return count;
		
		/* ---------------ONE LINER----------------------
		 	return String.valueOf(input1).length();   HERE WE CONVERT THE INTEGER TO STRING AND THEN CALCULATE THE LENGTH OF STRING USING .length() FUNCTION
		 */
	}
}
