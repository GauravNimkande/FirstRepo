
public class Foreachloop {

	public static void main(String[] args) {
		int[] T={1,4,5,3,6,8,22,10,2};
          int x=T[0];
		for(int element:T){
			
			if(element>x){
			
				x=element;
			}		
		}
		System.out.println("Max Number Is : "+x);
	}

}
