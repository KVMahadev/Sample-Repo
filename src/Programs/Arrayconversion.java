package Programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Arrayconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] Arr = { "A", "B", "C" };
		System.out.println(Arr.length);
		String Arr1 = String.join(";", Arr);
		System.out.println(Arr1);

		String Arr2 = Arrays.asList("c", "o", "l", "l", "e", "c", "t").stream().collect(Collectors.joining(";"));
		System.out.println(Arr2);

		String Arr3 = Arrays.asList(1, 2, 3, 4, 5).stream().map(e -> String.valueOf(e))
				.collect(Collectors.joining("*"));
		System.out.println(Arr3);

		System.out.println(joinString(";", "a", "b", "c"));
	}

	public static String joinString(String separator, String... values) {
		StringBuilder sb = new StringBuilder();
		int end = 0;
		for (String s1 : values) {
			if (s1 != null) {
				sb.append(s1);
				end = sb.length();
				sb.append(separator);
			}
		}
		return sb.substring(0, end);
	}
}
