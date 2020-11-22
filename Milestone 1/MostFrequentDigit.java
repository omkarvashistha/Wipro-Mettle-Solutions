//This program can be made by using arrays too and this program is quite lengthy because we have to take all digits of all inputs
package WiproLogicBuilding;
import java.util.*;
public class MostFrequentDigit {
	public int mostFrequentDigit(int input1,int input2,int input3,int input4) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		while(input1>0){
			int n=input1%10;
			if(hm.containsKey(n)){
				hm.put(n,hm.get(n)+1);
			}
			else{
				hm.put(n,1);
			}
			input1/=10;
		}
		while(input2>0){
			int n=input2%10;
			if(hm.containsKey(n)){
				hm.put(n,hm.get(n)+1);
			}
			else{
				hm.put(n,1);
			}
			input2/=10;
		}
		while(input3>0){
			int n=input3%10;
			if(hm.containsKey(n)){
				hm.put(n,hm.get(n)+1);
			}
			else{
				hm.put(n,1);
			}
			input3/=10;
		}
		while(input4>0){
			int n=input4%10;
			if(hm.containsKey(n)){
				hm.put(n,hm.get(n)+1);
			}
			else{
				hm.put(n,1);
			}
			input4/=10;
		}
		int max=0,res=0;
		for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
			if(entry.getValue()>=max){
				max=entry.getValue();
				res=entry.getKey();
			}
		}
		return res;
	}
}
