package WiproLogicBuilding;

public class SecondWordUppercase {
	public String secondWordUpperCase(String input1) {
		String[]arr=input1.split(" ");  // This will remove the space from string and put each word as separate value in String array
		if(arr.length<2) {	// THis will tell if string had less than 2 words
			return "LESS";
		}
		return arr[1].toUpperCase();	// We have to return 2nd word so the 1st index element will be 2nd word in string 
		
/*-------------------Shorter solution using ternary operator-----------------------------------------------*/
		String[]arr1=input1.split(" ");
		return (arr1.length<2)?"LESS":arr1[1].toUpperCase();
	}
}
