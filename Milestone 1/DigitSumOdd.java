package WiproLogicBuilding;

public class DigitSumOdd {
	public int digitSumOdd(int input1) {
		int sum=0;
		while(input1>0){
			int n=input1%10;
			if(n%2!=0){        // Will allow only odd digits
				  sum+=n; 
			}
			input1/=10;
		}
		return sum;
	}
}
