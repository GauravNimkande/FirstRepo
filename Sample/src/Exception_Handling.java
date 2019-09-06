import javax.jws.soap.SOAPBinding;

public class Exception_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			
		int A=2;
		
		if(A==0){
			throw new Exception("sanjeev");
		}
		int B=50/A;
		
		System.out.println("Final Value of Division is :"+B);
		
		}catch(Exception e){
			//System.out.println("Warning: ArithmeticException");
			//e.printStackTrace();
			e.getMessage();
			System.out.println(e.getMessage());
			//e.hashCode();
			//e.getCause();
		
		}
		
  System.out.println("Outside the try-Catch block");
  
  
		
	}

}
