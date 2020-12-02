package logicbuildingHour_2;

public class SumOfPowersOfDigits {
	public int sumOfPowers(int input1) {
		int sum=0,count=1; 
		int prev=0;  // This will take the previous digit that will be the power of current digit
		while(input1>0){
			int n=input1%10;		//current digit
			if(count>1){
				sum+=(int)Math.pow(n,prev);
			}
			else{			// This will check for the rightmost digit as it will have power of 0;
				sum+=1;		// 1 is added because any number to the power 0 is 1
			}
			input1/=10;
			prev=n;
			count++;
		}
		return sum;
	}
}
