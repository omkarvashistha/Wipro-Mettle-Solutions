package WiproLogicBuilding;

public class NthPrime {
	public int nthPrime(int input1) {
		int num=2,res=0;
		for(int n=0;n<=input1;){   // this will keep in check when the nth element is reached
			int flag=0;
			for(int i=2;i<num/2;i++){		//condition to check prime number
				if(num%i==0){
					flag=1;
					break;
				}
			}								// Till here
			if(flag==0){
				res=num;
				n++;
			}
			num++;
		}
		return res;
	}
}
