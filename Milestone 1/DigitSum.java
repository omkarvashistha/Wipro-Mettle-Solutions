package WiproLogicBuilding;

public class DigitSum {
	public int digitSum(int input1) {
		int sum=0;
		while(input1!=0){      // to take out last digit from number and add them
			int n=input1%10;
			sum+=n;
			input1/=10;
		}
		if(sum<-9 || sum>9){   // if number is two-digit or more then we will have to add them again to make them single-digit
			return digitSum(sum);
		}
		return sum;
	}
}
