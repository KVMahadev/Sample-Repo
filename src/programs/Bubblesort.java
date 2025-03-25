package programs;

public class Bubblesort {
	// TODO Auto-generated method stub

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n - i- 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 3, 1 };
		System.out.println("Array before sorting:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		bubbleSort(arr);
		System.out.println("Array after sorting:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
