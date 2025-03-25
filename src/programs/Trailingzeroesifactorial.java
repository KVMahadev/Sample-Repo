package programs;

public class Trailingzeroesifactorial {

	static int factorial(int n) {
		int res = 0;
		int power = 5;

		while (n >= power) {
			res = res + (n / power);
			power = power * 5;
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(25));

	}

}
