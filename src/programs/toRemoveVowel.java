package programs;

public class toRemoveVowel {
	
	public static void toremove(String str)
	{
		String str1 = " ";
		for (int i=1; i<str.length();i++) {
			char c = str.charAt(i);
			if (!(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'||c=='A' || c=='E'||c=='I'||c=='O'||c=='U')) {
				str1=str1+c;
			}				
		}
		System.out.println("Output is  " + str1);

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String S = "Master the Blaster";
		String Vowel = "aeiouAEIOU";
		String output = " ";
				for (char c:S.toCharArray()) {
					if (Vowel.indexOf(c)==-1) {
						output = output+c;
					}
				}
		System.out.println(output);
		

	}
}*/

		toremove("TESTING");
}
}