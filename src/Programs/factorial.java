package Programs;

public class factorial {

	static int factorial (int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		System.out.println(factorial(n));

	}

}
