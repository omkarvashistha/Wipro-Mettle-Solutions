package logicbuildingHour_2;

public class SimpleEncodedArray {
	public class Result{
		public final int output1;
		public final int output2;
		
		public Result(int out1,int out2) {
			output1=out1;
			output2=out2;
		}
	}
	
	public Result findOriginalFirstAndSum(int[]input1,int input2) {
		int[]org=new int[input2];
		int sum=0;
		org[input2-1]=input1[input2-1];
		sum+=org[input2-1];
		for(int i=input2-2;i>=0;i--){
			org[i]=input1[i]-org[i+1];
			sum+=org[i];
		}
		return new Result(org[0],sum);
	}
}
