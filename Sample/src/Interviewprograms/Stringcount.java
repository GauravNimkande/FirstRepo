package Interviewprograms;

public class Stringcount {

	public static void main(String[] args) {
		String count="101001011110";
        
		int Onenum= 0;
		int Zeronumber=0;
		for(char c : count.toCharArray()){
			if(c=='1'){
				Onenum++;                                                                                                                                                                                                     
			}else if(c=='0'){
				Zeronumber++;
			}
		
		}
		
		System.out.println("Number of ones in the string is "+Onenum);
		
		System.out.println("Number of zeros in the string is "+Zeronumber);
		
	}

}
