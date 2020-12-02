package logicbuildingHour_2;

public class MostFrequentDigit {
	public int mostFrequentDigit(int[]input1,int input2) {
		int[]temp=new int[10];    // This array will store the frequency of each digit and length of array is 10 because digits can only be 0-9
		for(int i=0;i<input2;i++){
			while(input1[i]>0){
				int n=input1[i]%10;
				temp[n]++;			// This will increment the frequency of digit each time it appears
				input1[i]/=10;
			}
		}
		int freq=0,num=0;
		for(int i=0;i<10;i++){
			if(temp[i]>=freq){		// "=" is necessary because we have to return the larger number if two numbers have same frequency
				freq=temp[i];
				num=i;
			}
		}
		return num;
	}
}
