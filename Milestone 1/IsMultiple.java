package WiproLogicBuilding;

public class IsMultiple {
	public int isMultiple(int input1,int input2) {
		if(input1==0 || input2==0) {  // If any number is 0 function has to return 3
			return 3;
		}
		if(input1%input2==0) {  // if input1 is exact multiple of input2 the remainder will be 0
			return 2;
		}
		else {
			return 1;
		}
		/*---------------ONE LINER FOR SECOND IF--------------------
		 * 
		 	return (input1%input2==0)?2:1;
		 *
		 */
	}
}
