package WiproLogicBuilding;

public class Nfactorial {
	public int nFactorial(int input1) {
		if(input1==0) {
			return 1; // Final answer will return from this.
		}
		return input1*(input1-1);  // Recursive method for factorial.
	}
}
