package logicbuildingHour_2;

public class GetCodeThroughStrings {
	public int getCodeThroughStrings(String input1) {
		String[]arr=input1.split(" ");
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i].length();
		}	
		int res=0;
		while(sum>0){
			res+=sum%10;
			sum/=10;
		}
		return res;
	}
}
