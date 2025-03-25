package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Duplicate using String
		String[] str = { "Krish", "Vinu", "Rudra", "Deepa", "Krish" };
		Set<String> dup = new HashSet<String>();
		for (String string1 : str) {
			if (dup.add(string1) == false) {
				System.out.println("Duplicate element is" + " " + string1);
			}
		}

		// Duplicate using Character

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = Sc.nextLine();
		int size = str1.length();
		Set<Character> ch2 = new HashSet<>();
		for (int i = 0; i < size; i++) {
			char a = str1.charAt(i);
			if (ch2.add(a) == false) {
				System.out.println("Duplicate character is" + a);
			}

		}
		for (Character ch3 : ch2) {
			System.out.println(ch3);

		}
		
		

		System.out.println("To Remove Duplicate using Linked Hashset");
		ArrayList<Integer> AL1 = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9));
		LinkedHashSet<Integer> LH = new LinkedHashSet<>(AL1);
		System.out.println("Using LinkedHashset" + LH);
		ArrayList<Integer> Numberwithoutduplicates = new ArrayList<>(LH);
		System.out.println(Numberwithoutduplicates);
		System.out.println("************** Using Streams*************");
		System.out.println(LH.containsAll(AL1));
	}
}
