package programs;

public class RemoveduplicatesfromSortedArray {
	static int removeduplicates(int ar[]) {
		int rd = 0;
		for (int i = 1; i < ar.length; i++) {
			if (ar[rd] != ar[i]) {
				rd++;
				ar[rd] = ar[i];
			}
		}
		return rd + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 2, 2, 4, 5, 5, 6, 6 };
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		int rd = removeduplicates(ar);
		System.out.println();

		for (int i1 = 0; i1 < rd; i1++) {
			System.out.println(ar[i1]);
		}

	}

}
