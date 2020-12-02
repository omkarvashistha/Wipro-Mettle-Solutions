package logicbuildingHour_2;

public class SumOfSumOfDigitsinCyclicOrder {
	public int sumOfsumOfDigits(int input1) {
		String temp=input1+"";  		//Convert integer to string
		int sum=0;
		for(int i=0;i<temp.length();i++){
			for(int j=i;j<temp.length();j++){
				sum+=Integer.parseInt(String.valueOf(temp.charAt(j)));
			}
			System.out.println(sum);    // Just for debugging
		}
		return sum;
	}
}
