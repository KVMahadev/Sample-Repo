package programs;

public class spanofArray {

	static int span(int arr[]) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return max - min;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 5, 6, 7, 8 };
		System.out.println(arr.length);
		System.out.println(span(arr));
	}

}
