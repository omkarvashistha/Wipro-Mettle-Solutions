package WiproLogicBuilding;

public class WeightOfString {
	public int weightOfString(String input1,int input2) {
		input1=input1.toUpperCase();	// so that every character comes to same case
		int sum=0;
		for(int i=0;i<input1.length();i++){
			char ch=input1.charAt(i);		// take character of string
			if(Character.isLetter(ch)){		//isLetter() checks if the character is alphabet
				if(input2==0){
					if(ch!='A' && ch!='E' && ch!='O' && ch!='I' && ch!='U'){		// This condition will allow consonants only
						sum+=(int)((ch-'A')+1);			// +1 because A=1 B=2 and so on but A-A will give us 0
					}
				}
				else{
					sum+=(int)((ch-'A')+1);
				}
			}
		}
		return sum;
	}
}
