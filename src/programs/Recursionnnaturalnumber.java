package programs;

public class Recursionnnaturalnumber {

	static void naturalN(int N) {
		if (N == 0) {
			return;
		}
		naturalN(N - 1);
		System.out.print(N);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		naturalN(5);

	}

}
