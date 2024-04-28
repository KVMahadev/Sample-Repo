package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"Krish", "Vinu", "Rudra", "Deepa", "Krish"};
		Set<String> dup = new HashSet<String>();
		for (String string1 : str) {
			if(dup.add(string1)==false){
				System.out.println("Duplicate element is" + " " + string1);
			}			
		}
		
		System.out.println("To Remove Duplicate using Linked Hashset");
		ArrayList<Integer> AL1 = new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,4,5,6,6,7,8,9));
		LinkedHashSet<Integer> LH = new LinkedHashSet<>(AL1);
		System.out.println(LH);
		ArrayList<Integer> Numberwithoutduplicates = new ArrayList<>(LH);
		System.out.println(Numberwithoutduplicates);
	}
}
