package programs;

import java.util.*;

public class compareHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> Map1 = new HashMap<>();
		Map1.put(1, "1 of Map 1");
		Map1.put(2, "2 of Map 1");
		Map1.put(3, "3 of Map 1");
		Map1.put(4, "4 of Map 1");
		Map1.put(5, "4 of Map 1");
		Map1.put(6, "4 of Map 1");
		System.out.println(Map1);
		
		Iterator<Integer> IT1=Map1.keySet().iterator();
		while(IT1.hasNext()) {
			Integer I1=IT1.next();
			String value = Map1.get(I1);
			System.out.println("Key is" + " " + I1+ "Value is"+ " " + value);
			
		}

		HashMap<Integer, String> Map2 = new HashMap<>();
		Map2.put(1, "1 of Map 2");
		Map2.put(2, "2 of Map 2");
		Map2.put(3, "3 of Map 2");
		Map2.put(4, "4 of Map 2");

		HashMap<Integer, String> Map3 = new HashMap<>();
		Map3.put(1, "1 of Map 3");
		Map3.put(2, "2 of Map 3");
		Map3.put(4, "4 of Map 3");
		System.out.println(Map3.get(1));

		System.out.println(Map1.keySet().equals(Map3.keySet()));
		Collection<String> valueofMap1 = Map1.values();
		System.out.println(valueofMap1);
		Collection<String> valueofMap2 = Map2.values();
		System.out.println(valueofMap2);
		System.out.println(Map1.values().equals(Map2.values()));
		
		

		System.out.println("********Using Lambda*****");
		Map3.forEach((K, V) -> System.out.println("Value of K is" + K + " and + Value is " + V));
	}

}
