package WiproLogicBuilding;

public class IsPalindrome {
	public int isPalinNum(int input1) {
		int temp=input1;  // take temporary variable for reversing
		int rev=0;
		while(temp>0){
			int rem=temp%10;     
			rev=10*rev+rem;			// This will reverse the input must remember this logic
			temp/=10;
		}
		if(rev==input1){
			return 2;
		}
		else{
			return 1;
		}
		
		/* Shorter Solution using Strings */ 
		
		String temp=String.valueOf(input1);   // This will convert integer to String 
		StringBuilder rev=new StringBuilder(temp).reverse(); // Now make a string builder and append temp and then reverse the string using reverse() function
		return rev.toString().equals(temp)?2:1; 	// Compare both strings using equals() method
		
		/*can make is just of two lines by doing this*/
		
		StringBuilder rev=new StringBuilder(String.valueOf(input1)).reverse();//what we did is instead of additional temp variable we did it in same line inside StringBuilder(String.valueOf(input1))
		return rev.toString().equals(String.valueOf(input1))?2:1;  
	}
}
