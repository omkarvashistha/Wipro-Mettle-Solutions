package WiproLogicBuilding;

public class IsPalindromePossible {
	public int isPalinPossible(int input1) {
		int[]arr=new int[10];
		while(input1>0){
			arr[input1%10]++;
			input1/=10;
		}
		int odd=0;
		for(int i=0;i<10;i++){
			if((arr[i]&1)==1){
				odd++;
			}
			if(odd>1){
				return 1;
			}
		}
		return 2;
	}
}
