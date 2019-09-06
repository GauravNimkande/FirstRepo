import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sortarray {

	
	
	void Sortusingcollection() {
		
		
		ArrayList<Integer> AL=new ArrayList<Integer>();
		
		AL.add(44);
		AL.add(25);
		AL.add(75);
		AL.add(20);
		AL.add(10);
		
		Collections.sort(AL);
		System.out.println(AL);
	}
	
	void sortusingarray() {
		int AB[]= {45,66,10,4,70};
		Arrays.sort(AB);
		for(int i:AB) {
			
		System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		Sortarray SA=new Sortarray();
		
	System.out.println("Main Program Execution Started ");
		
	//SA.Sortusingcollection();
	SA.sortusingarray();
		

	}

}
