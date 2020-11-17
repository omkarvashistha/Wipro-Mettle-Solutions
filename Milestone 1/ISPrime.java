package WiproLogicBuilding;

public class ISPrime {
	public int isPrime(int input1) {
		for(int i=2;i<input1/2;i++){
			if(input1%i==0){
				return 1;
			}
		}
		return 2;
	}
}
