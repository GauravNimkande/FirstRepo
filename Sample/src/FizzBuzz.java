
public class FizzBuzz extends Abstractclass{

	public static void main(String[] args) {
		int i;
		
		for(i=0;i<=50;i++){
			
			if(i % (5*3) ==0){
				System.out.println(i +" Is FizzBUZZ ");
						
			}
			else if(i % 5 ==0){
				System.out.println(i +" Is BUZZ ");
						
			}
			else if(i % 3==0){
				System.out.println(i +" Is FIZZ ");
			}
			else{
				System.out.println(i);
			}
			
			
		}
	}
	void runnable() {
		System.out.println("abc");
		
	}

}
