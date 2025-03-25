package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hashMapprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*No order and indexing - Hence For loop cannot be used
		 * Store values based on Key and Value
		 * Key cannot be duplicate
		 * Can store n number of null values but only one nul key
		 * Hashmap is not threadsafe
		 */
		
		HashMap<String,String> HM = new HashMap<String, String>();
		HM.put("TEST", null);
		HM.put("TESTING", "Test 1");
		HM.put(null, null);
		HM.put(null, null);
		HM.put("TESTING", "Test 2");
		System.out.println(HM);
		
		System.out.println("****************Using Key set******************");
		
		Iterator<String> IT1 =HM.keySet().iterator();
		while(IT1.hasNext()) {
			String Key=IT1.next();
			String value = HM.get(Key);
			System.out.println(Key +" " + "and" + " "+ value );
		}
		
		System.out.println("****************Using Entry set******************");
		Iterator <Entry<String, String>> IT2=HM.entrySet().iterator();
		while (IT2.hasNext()){
			 Entry<String,String> ET1 = IT2.next();
			 System.out.println("Key = " + ET1.getKey() + " " +"Value = " + ET1.getValue());			 
		}
		
		System.out.println("******To convert to  ArrayList using Key*********");
		ArrayList<String> AR1 = new ArrayList<String>(HM.keySet());
		for (String List : AR1) {
			System.out.println(List);			
		}
		
		System.out.println("******To convert to  ArrayList using Values*********");
		ArrayList<String> AR2 = new ArrayList<String>(HM.values());
		for (String List1 : AR2) {
			System.out.println(List1);			
		}
		
		
}
}