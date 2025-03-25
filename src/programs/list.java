package programs;

import java.util.ArrayList;
import java.util.Arrays;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list1 = new ArrayList();
		list1.add("TEST");
		list1.add("Check");
		list1.add("Master");
		System.out.println(list1);
		
		ArrayList<String> list2 = new ArrayList();
		list2.add("Ball");
		list2.add("Vinayak");
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
		
		Object arr1[]=list1.toArray();
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		for (int i=0; i<arr1.length;i++) {
				System.out.println(arr1[i]);
		}
		
	

	}

}
