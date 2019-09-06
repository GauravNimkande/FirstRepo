import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Max_num_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Marks[]={10,201,133,40};
		int max = Marks[0];
		for(int i : Marks){		
			if(Marks[i]>max)
			{
				 max = Marks[i];
				 System.out.println(max);
			   
			}
			
		}
		
		//System.out.println(Stream.of(Marks).filter(Predicate.isEqual(20));
	  /*  int max = Marks[0];
	for(int i=1;i<Marks.length;i++){
			
			if(Marks[i] > max)
			{
				 max = Marks[i];
				 System.out.println(max);
			}
			
		//	System.out.println(maxnub);
			
		
	}*/
}
}
	

