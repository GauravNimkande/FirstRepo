import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadtxtFile {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("C:\\Users\\gauravn\\Desktop\\readxt.txt");
		BufferedReader br = new BufferedReader(fr);
		StringBuffer str = new StringBuffer();
		try {
			String line=null;
			while((line=br.readLine())!= null)
			{
				str.append(line);		
			}
		
		} catch (IOException e) {
		e.printStackTrace();
		}
		System.out.println(str);
		}
}