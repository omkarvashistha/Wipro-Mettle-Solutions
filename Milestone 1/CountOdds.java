package WiproLogicBuilding;

public class CountOdds {
	public int countOdds(int input1,int input2,int input3,int input4,int input5) {
		int count=0; // TO COUNT THE NUMBER OF EVEN NUMBERS
		if(input1%2==0){  // CONDITION OF A NUMBER TO BE EVEN that is IF A NUMBER IS DIVISIBLE BY 2 IT IS EVEN
			count++;
		}
		if(input2%2==0){
			count++;
		}
		if(input3%2==0){
			count++;
		}
		if(input4%2==0){
			count++;
		}
		if(input5%2==0){
			count++;
		}
		return 5-count;  // out of 5 those who are not even will be odd
	}
}
