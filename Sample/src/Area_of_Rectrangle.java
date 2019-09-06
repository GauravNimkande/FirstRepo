import java.util.Scanner;

public class Area_of_Rectrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  Scanner scanner=new Scanner(System.in);	
  System.out.println("Enter the length of Rectangle:");
  double length1=scanner.nextDouble();
  
  System.out.println("Enter the Width of Rectangle:");
  double Width=scanner.nextDouble();
  
  double RecArea=length1*Width;
  
  System.out.println("Total Area of Rectrangle is : "+RecArea);
  
  
		
	}

}
