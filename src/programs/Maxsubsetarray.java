package programs;

public class Maxsubsetarray {

	public static int maxSubArray(int a[]) {
		int sum = 0;
		int maxsum = 0;

		for (int i = 0; i < a.length; i++) {
			if (sum > 0) {
				sum = sum + a[i];
			} else
				sum = a[i];
		}
		if (sum > maxsum) {
			maxsum = sum;
		}

		return maxsum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 1, 1, 1, 1, 1 };
		System.out.println(maxSubArray(a));

	}

}
