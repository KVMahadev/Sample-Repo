package Programs;

import java.util.ArrayList;

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
		
	

	}

}
