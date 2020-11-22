package WiproLogicBuilding;

public class IsPalindromeString {
	public int isPalin(String input1) {
		input1=input1.toLowerCase();
		char[]arr=new char[input1.length()];
		int j=0;
		for(int i=input1.length()-1;i>=0;i--){
			arr[j]=input1.charAt(i);
			j++;
		}
		String res=new String(arr);
		if(res.equals(input1)){
			return 2;
		}
		else{
			return 1;
		}
		
		/*Shorter Solution*/
// What we do is use StringBuilder and reverse the string and then compare with the variable res which is reverse of input1 and if both are equals it means it is Palindrome
		StringBuilder rev=new StringBuilder(input1.toLowerCase()).reverse();
		return String.valueOf(rev).equals(input1.toLowerCase())?2:1;
	}
}
