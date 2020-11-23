package logicbuildingHour_2;

public class FindStringCode {
	public int findStringCode(String input1) {
		input1=input1.toUpperCase();   // So that all the letters get in same case
		   String res="";
		   String[]arr=input1.split(" "); 	// This will give different words to different indexes of the array
		   for(int i=0;i<arr.length;i++){
			   int n=arr[i].length();
			   if(n%2==0){
				   int sum=0;
				   for(int j=0;j<n/2;j++){		// half length because we will take characters from front end and rear end
					   int first=(int)(arr[i].charAt(j)-'A')+1;			// This will give first character of string
					   int last=(int)(arr[i].charAt(n-1-j)-'A')+1;		// This will give last character of string 
					   int diff=(int)Math.abs(first-last);
					   sum+=diff;
				   }
				   res+=sum;
			   }
			   else{
				   int sum=0;
				   for(int j=0;j<n/2;j++){
					   int first=(int)(arr[i].charAt(j)-'A')+1;
					   int last=(int)(arr[i].charAt(n-1-j)-'A')+1;
					   int diff=(int)Math.abs(first-last);
					   sum+=diff;
				   }
					sum+=(int)(arr[i].charAt(n/2)-'A')+1; // because if length of word is odd then middle character will have no pair so we haver to take it individually 
				   res+=sum;
			   }
		   }
		   return Integer.parseInt(res);  // This will convert the string to integer
	}
}
