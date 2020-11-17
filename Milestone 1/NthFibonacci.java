package WiproLogicBuilding;

public class NthFibonacci {
	public int nthFibonacci(int input1) {
		int a=0;  // because the series always starts from 0 and 1
		int b=1;
		int c=0;
		for(int i=3;i<=input1;i++){  // i=3 because first two are already declared
			c=a+b;
			a=b;
			b=c;
		}
		return c;   // this will return the nth factorial
	}
}
