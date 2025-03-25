package programs;

import java.util.*;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value[] = { 20, 34, 54, 349, 345 };
		TreeSet<Integer> Tr1 = new TreeSet<Integer>();
		for (int sort : value) 
		{
			Tr1.add(sort);
		}
		System.out.println(Tr1);

		if (Tr1.size() < 2) 
		{
			System.out.println("Could not find second largest element");
		}
		else
		{
		Integer secondLargest = null;
		Integer largest = null;
				for  (int second : Tr1) {
				secondLargest = largest;
				largest= second;				
			}
		System.out.println(secondLargest);
		}
		
}
}