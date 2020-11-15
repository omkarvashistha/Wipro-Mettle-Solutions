package WiproLogicBuilding;

public class CountEvenOdds {
	public int countEvenOdds(int input1,int input2,int input3,int input4,int input5,String input6) {
		if(input6.equals("even")){    // to compare two strings use "string1.equals(string2)" in this case string1 is input6 and string2 is "even"
			int count=0; 
			if(input1%2==0){  
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
			return count;
		}
		else{
			int count=0; 
			if(input1%2!=0){  
				count++;
			}
			if(input2%2!=0){
				count++;
			}
			if(input3%2!=0){
				count++;
			}
			if(input4%2!=0){
				count++;
			}
			if(input5%2!=0){
				count++;
			}
			return count;
		}
	}
}
