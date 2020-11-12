package WiproLogicBuilding;

public class SumLastdigits {
	public int addlastDigits(int input1,int input2) {
		int last1=input1%10;  //last digit of first number
		int last2=input2%10;  //last digit of second number
		last1=Math.abs(last1);
		last2=Math.abs(last2);
		int sum=last1+last2;
		return sum;
		
		/*One Liner
		  return Math.abs(input1%10)+Math.abs(input2%10);
		 												*/
	}

}
