package collections;

import java.util.HashMap;
import java.util.Map;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class Collectionpract1 {

	public static void main(String[] args) {
	
		Map mp=new HashMap();
		
		mp.put("Name", "Gaurav");
		mp.put("MedalName", "Vijay");
		mp.put("Sername", "Nimkande");
		
	System.out.println(mp.get("Name"));
	System.out.println(mp.get("MedalName"));
	System.out.println(mp.get("Sername"));
		
		

	}

}
