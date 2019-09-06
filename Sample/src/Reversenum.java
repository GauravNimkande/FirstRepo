
public class Reversenum {

	public static void main(String[] args) {
		int num=23456;
	int sample=0;
	
	while(num!=0){
			sample=(sample*10)+(num/10);
		num=num/10;
		//System.out.println("Number Is :"+sample );
		}
		System.out.println("Number Is :"+sample );

	}

}
