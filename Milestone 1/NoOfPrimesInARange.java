package WiproLogicBuilding;

public class NoOfPrimesInARange {
	public int countPrimesInRange(int input1,int input2) {
		int count=0;
		for(int i=input1;i<=input2;i++){
			int flag=0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(i);
				count++;
			}
		}
		return count;
	}
}
