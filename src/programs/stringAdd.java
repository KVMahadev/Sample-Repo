package programs;

public class stringAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"Automated", "Manual", "Krish"};
		int size = str.length;
		System.out.println(size);
		for (int i=0;i<size;i++) {
			String str1 = str[i].concat("Testing");
			System.out.println(str1);
		}
		
	}

}
