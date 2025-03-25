package programs;

public class deletionofadjacentcharacters {

	static int adjacentcharacters(String S) {
		int count = 0;
		System.out.println("count is " + S.length());
		for (int i = 1; i < S.length(); i++) {
			System.out.println("The value of i is " + i + " " + "during the" + " " + i + "st " + "Iteration");
			System.out.println("The character is" + "  " + S.charAt(i));
			System.out.println("The character at" + " " + (i - 1) + " is " + S.charAt(i - 1));
			if (S.charAt(i) == S.charAt(i - 1)) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "AAABBCCA";
		System.out.println(deletionofadjacentcharacters.adjacentcharacters(S));
	}

}
