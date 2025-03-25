package programs;

public class luckNumber {
	
	public static boolean isLuckyNumber(int n, int counter) {
		if (n< counter) {
			return true;
		}
		if (n%counter ==0) {
			return false;
		}
		return isLuckyNumber(n-(n/counter), counter+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLuckyNumber(4, 2));

	}

}
