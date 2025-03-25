package programs;

public class movingNonZero {

	public static void moveZeroes(int num[]) {

		int size = num.length;
		if (size == 0 || size == 1) {
			return;
		}
		int nz = 0;
		int z = 0;
		while (nz < size) {
			if (num[nz] != 0) {
				int temp = num[nz];
				num[nz] = num[z];
				num[z] = temp;
				nz++;
				z++;
			} else
				nz++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 0, 1 };
		moveZeroes(num);
		for (int num1 : num) {
			System.out.print(num1 + " ");
		}
	}

}
