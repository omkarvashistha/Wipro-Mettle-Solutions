package logicbuildingHour_2;
// We do not have to use BigInteger
public class AdditionUsingStrings {
	public String addditionUsingStrings(String str1,String str2) {
		// Before proceeding further, make sure length  
	    // of str2 is larger.  
	    if (str1.length() > str2.length()){  
	        String t = str1; 
	        str1 = str2; 
	        str2 = t; 
	    } 
	    String str = "";  
	    int n1 = str1.length(), n2 = str2.length();  
	   
	    str1=new StringBuilder(str1).reverse().toString(); 	   // Reverse both of Strings
	    str2=new StringBuilder(str2).reverse().toString(); 
	  
	    int carry = 0;  
	    for (int i = 0; i < n1; i++)  
	    {  
	        // Do school mathematics, compute sum of  
	        // current digits and carry  
	        int sum = ((int)(str1.charAt(i) - '0') + (int)(str2.charAt(i) - '0') + carry);  
	        str += (char)(sum % 10 + '0');   
	        carry = sum / 10;  	 // Calculate carry for next step 
	    }  
	  
	    // Add remaining digits of larger number  
	    for (int i = n1; i < n2; i++)  
	    {  
	        int sum = ((int)(str2.charAt(i) - '0') + carry);  
	        str += (char)(sum % 10 + '0');  
	        carry = sum / 10;  
	    }  
	  
	    // Add remaining carry  
	    if (carry > 0)  
	        str += (char)(carry + '0');  
	    // reverse resultant String 
	    str = new StringBuilder(str).reverse().toString(); 
	    return str;
	}
}
