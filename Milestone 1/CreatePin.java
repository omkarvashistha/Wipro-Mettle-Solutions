//This question is easy but it is just lengthy you have to do so much of stuff
package WiproLogicBuilding;
public class CreatePin {
	public int createPIN(int input1,int input2,int input3) {
		int u1,u2,u3,t1,t2,t3,h1,h2,h3;
		u1=input1%10;
		u2=input2%10;        // Here we take the UNIT digits
		u3=input3%10;

		t1=(input1/10)%10;
		t2=(input2/10)%10;	// Here we take the TENS  digits
		t3=(input3/10)%10;

		h1=input1/100;
		h2=input2/100;		// Here we take the HUNDREDS digits
		h3=input3/100;

		int m1=Math.min(Math.min(u1,u2),u3);	// Minimun of all unit digits
		int m2=Math.min(Math.min(t1,t2),t3);	// Minimun of all tens digits	
		int m3=Math.min(Math.min(h1,h2),h3);	// Minimun of all hundreds digits

		int ma1=Math.max(Math.max(u1,u2),u3);
		int ma2=Math.max(Math.max(t1,t2),t3);
		int ma3=Math.max(Math.max(h1,h2),h3);

		int max=Math.max(Math.max(ma1,ma2),ma3);	// Max of all the digits
		int res=1000*max+100*m3+10*m2+m1;
		return res;
	}
}
