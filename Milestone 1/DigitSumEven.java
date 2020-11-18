package WiproLogicBuilding;

public class DigitSumEven {
	public int digitSumEven(int input1) {
		int sum=0;
		while(input1>0){
			int n=input1%10;
			if(n%2==0){        // Will allow only even digits
				  sum+=n; 
			}
			input1/=10;
		}
		return sum;
	}
}
