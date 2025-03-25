package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayRemoveallRetainall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Remove all the common elements available in AL1 and AL2");
		
		ArrayList<String> AL1 = new ArrayList<String>(Arrays.asList("A", "D", "B", "D", "E"));
		ArrayList<String> AL2 = new ArrayList<String>(Arrays.asList("A","B", "C", "F", "G"));
		 System.out.println(AL1.get(1));
	    AL1.removeAll(AL2);
	   
		System.out.println(AL1);
		
		System.out.println("Retain all the common elements available in AL3 and AL4");
				
		ArrayList<String> AL3 = new ArrayList<String>(Arrays.asList("A", "D", "B", "D", "E"));
		ArrayList<String> AL4 = new ArrayList<String>(Arrays.asList("A","B", "C", "F", "G"));
		AL4.retainAll(AL3);
		System.out.println(AL4);
		
		System.out.println("Sort and see if all the common elements common in AL1 and AL2");
		
		ArrayList<String> AL5 = new ArrayList<String>(Arrays.asList("A", "D", "B", "D", "E"));
		ArrayList<String> AL6 = new ArrayList<String>(Arrays.asList("A","B", "C", "F", "G"));
		Collections.sort(AL5);
		Collections.sort(AL6);
		System.out.println(AL5.equals(AL6));

	}

}
