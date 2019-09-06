 package CunstructorPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import net.bytebuddy.description.modifier.SynchronizationState;

public class Palindrome {
	/*public static void PalindromeUsingStack(){
		String Name="naman";
		String ReverseString="";
		System.out.println("Checke Palindrome of string");
		
		Stack stk=new Stack();
		
		for(int i=0;i<Name.length();i++){
		
		stk.push(Name.charAt(i));
		}
		
		while(!stk.isEmpty()){
		ReverseString=ReverseString+stk.pop();
		}
		
	 if(Name.equals(ReverseString))	{
		 System.out.println("The Inpute String is Palindrome");
	 }else{
	System.out.println("The Input String is not Palindrome"); 
	 }
	 }
	
	public static void PalindromeUsingQueue(){
	
		String SampleName="naman";
		String Reverse="";
		Queue queue=new LinkedList();
		
		for(int i=SampleName.length()-1;i>=0;i--){
			queue.add(SampleName.charAt(i));
		}
		
		while(!queue.isEmpty()){
			Reverse=Reverse+queue.remove();
		}
		System.out.println(Reverse);
		
		if(SampleName.equals(Reverse)){
			System.out.println("Inpute String is Palidrome");
		}else{
			System.out.println("Inpute Strind is Not a Plaindrome");
		}
		
	}*/
	
	/*public static void PalindromeUsingStack2(){
		Stack st=new Stack();
		
		String Name="NAMAN";
		String Rev="";
		
		for(int i=0;i<Name.length();i++){
			st.push(Name.charAt(i));
		}
	while(!st.isEmpty()){
		Rev=Rev+st.pop();
	}
	if(Name.equals(Rev)){
	System.out.println("String is palindrome");	
	System.out.println("Reverse String is "+Rev);
	}else{
		System.out.println("String is not a palindrome");
	}
	}*/
	
	public static void PalindromeUsingQueue2(){
		String ABC="NAMAN";
       String Rst="";
		Queue qk=new LinkedList();	
	
try{
	for(int i=ABC.length()-1;i>=0;i--)
	{
		qk.add(ABC.charAt(i));
	}
	 while(!ABC.isEmpty()){
		 Rst+=qk.remove();
	 }
}catch(Exception e){
	e.getMessage();
	
}
		if(ABC.equals(Rst)){
			System.out.println("String is palindrome");	
			System.out.println("Reverse String is "+Rst);
			}else{
				System.out.println("String is not a palindrome");
			}	
	}
	
public static void main(String argd[]){
	//PalindromeUsingStack();
	PalindromeUsingQueue2();
	//PalindromeUsingStack2();
	
}

}
