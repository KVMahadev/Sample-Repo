package programs;

public class Uniquecharacters {
	
	public static void unqiue(String str) {
		str = "TESTING";
		char [] cc=str.toCharArray();
		for (int i=1; i==cc.length;i++) {
			char ch1 = cc[i];
			System.out.println(ch1);
		}
		String unique = "";
		char[] ch=str.toCharArray();
		for (char chu:ch) {
			if (str.indexOf(chu)==str.lastIndexOf(chu)) {
				unique +=chu;				
			}
		}
		System.out.println(unique);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unqiue("BLAHBLAH");

	}

}
