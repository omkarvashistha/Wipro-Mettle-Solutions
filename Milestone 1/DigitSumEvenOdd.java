package WiproLogicBuilding;

public class DigitSumEvenOdd {
	public int digitSumEvenOdd(int input1,String input2) {
		int sum=0;
		while(input1>0){
			int n=input1%10;
			input1/=10;
			if(input2.equals("even")){
				if(n%2==0)
				{
					sum+=n;
				}
			}
			else{
				if(n%2!=0){
					sum+=n;
				}
			}
		}
		return sum;
	}
}	
