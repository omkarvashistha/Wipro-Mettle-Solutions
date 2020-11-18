package WiproLogicBuilding;
public class NonRepeatedDigitsCount {
	public int nonRepeatedDigitsCount(int input1) {
		int[]arr=new int[10];  	// Array to store all the digits in number and we declared its size 10 because digits can only be from 0 to 9
		while(input1>0){
			arr[input1%10]++;  	//The frequency of the digit is incremented by 1
			input1/=10;			// This will remove the last digit form number
		}
		int count=0;
		for(int i=0;i<10;i++){
			if(arr[i]==1){		// if the frequency of digit is 1 this means that digit occurred only 1 time and is non-repeating
				count++;
			}
		}
		return count;
	}
}

					/* The other solution for this question will be using HashMap which will be dynamic because their space will no be vacant/empty */