/*There are other ways too to implement the program using arrays but I find using HashMap more comfortable*/
package WiproLogicBuilding;
import java.util.*;
public class UniqueDigitsCount {
	public int uniqueDigitsCount(int input1) {
		HashMap<Integer,Integer> hm=new HashMap<>();    // We used HashMap because it will create single entry for similar digits 
		while(input1>0){								// While loop to take out every digit one by one from last
			int n=input1%10;	// This will take last digit of the number
			if(hm.containsKey(n)){						//We check if n is already in HashMap if it is then we increment its count by 1
				int count=hm.get(n);
				hm.put(n,count+1);
			}
			else{
				hm.put(n,1);	// If n is not in HashMap then we give it 1 because it occurred for the first time 
			}
			input1=input1/10;	// This will remove the last digit from the number
		}
		return hm.size();       // All the unique digits will now be in HashMap and now we simply just return its size
	}
}
