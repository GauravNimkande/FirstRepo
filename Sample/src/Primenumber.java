
public class Primenumber {

	public boolean Primenumber(int number){
		
		int temp=0;
		
		for(int i=1;i<=number/2;i++){
			if(number%i==0){
				temp+=i;
				
			}
		}
		if(number==temp){
			System.out.println("Number Is perfect number");
			return true;
		}
		else{
			System.out.println("Number Is not a perfect number");
			return false;
		}
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primenumber pr=new Primenumber();
		System.out.println("Number Is Perfect number "+ pr.Primenumber(79));
		

	}

}
