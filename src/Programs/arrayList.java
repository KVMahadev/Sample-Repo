package Programs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> AL = new ArrayList<String>();
		AL.add("TEST 1");
		AL.add(0, "MARK 0");
		AL.add(2, "MARK 2");
		AL.add(3, "MARK 3");
		AL.add(4, "MARK 4");
		AL.add(5, "MARK 5");
		AL.add(6, "MARK 6");
		AL.add(7, "MARK 7");
		AL.add(8, "MARK 8");
		AL.add(9, "MARK 9");
		AL.add(10, "MARK 10");
		AL.add("Mark 11");
		System.out.println("The list of AL is" + " " +AL);
		System.out.println(" The Size of AL is" + " " +AL.size());
		System.out.println(AL.get(6));
		System.out.println("**********************************************************");
		//using Map function
		AL.stream().forEach(e ->System.out.println(e));
		
		System.out.println("**********************************");
		
		ArrayList <String> Clonelist =(ArrayList<String>)AL.clone();
		System.out.println("The output of Clone list is" + Clonelist);
		
		System.out.println("**********************************");
		System.out.println("How to Add Array as List and how to add that collection");
		ArrayList<String> AL3 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		AL3.addAll(Clonelist);
		System.out.println(AL3);
		AL3.addAll(3, Clonelist);
		System.out.println(AL3);
		
		System.out.println("**********************************");
		System.out.println("How to create Sublist from Arraylist");
		ArrayList<Integer> I1= new ArrayList<Integer>(Arrays.asList(2,3,4,5,90,45));
		I1.removeIf(l2 ->l2%2==0);
		System.out.println(I1);
		System.out.println(new ArrayList<Integer>(I1.subList(0, 2)));
		
		
		

	}

}
